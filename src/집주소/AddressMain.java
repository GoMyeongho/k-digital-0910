package 집주소;

import java.util.ArrayList;
import java.util.List;

public class AddressMain {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>(List.of());
        String ansStr = "";
        while (true) {
            String num = Address.sc.nextLine();
            if (num.equals("0")) break;
            // 첫번째 방법
            ans.add(Address.calcWidth(num));
            // 두번째 방법
            ansStr += String.valueOf(Address.calcWidth(num));
            ansStr += " ";
        }
        String[] ansList = ansStr.split(" ");
        for (int e : ans) System.out.println(e);
        for (String e : ansList) System.out.println(e);
    }

}
