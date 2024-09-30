package 집주소;

import java.util.Scanner;

public class Address {
    public static Scanner sc = new Scanner(System.in);
    public final static int[] numberWidth = {5,3,4};
    public static int calcWidth(String num) {
        int width = 1;
        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '0': width += numberWidth[0]; break;
                case '1': width += numberWidth[1]; break;
                case '2', '3', '4', '5', '6', '7', '8', '9':
                    width += numberWidth[2];
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
        return width;
    }
    public static int calcWidth(int num){
        int width = 1;
        int length = String.valueOf(num).length();
        int temp;
        for (int i = length ; i >= 0; i--) {
            temp = (int) (num % Math.pow(10,i+1) /  Math.pow(10,i));
            if (temp > 2) width += 4;
            else width += numberWidth[temp];
        }
        return width;
    }
}
