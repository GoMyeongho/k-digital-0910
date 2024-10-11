package 파일입출력;
//


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InOutStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/파일입출력/chicken.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일을 찾지 못했습니다.");
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
