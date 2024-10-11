package 자바파이널과제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

// - 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력해둠.
// - 이름 국어 영어 수학 형식
// 해당 파일을 읽어 총점을 구하고
// 총점이 높은 사람 순으로 이름과 총점 보여주기 ( 총점이 같은 경우 이름순으로)
public class JavaFinalReportMain {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/자바파이널과제/Student.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일을 찾지 못했습니다.");
        }
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) { // 형식이 일관하기 때문에 sc.next() 와 sc.nextInt() 사용
            //String[] info = sc.nextLine.split(" ")
            //list.add(new Student(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]))
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            list.add(new Student(name,kor,eng,math));
        }
        sc = new Scanner(System.in);
        Collections.sort(list);
        while (true) {
            System.out.print("정렬방법 [1] 앞 정렬  [2] 가운데 정렬  [3] 뒤 정렬 : ");
            switch (sc.nextInt()) {
                case 1:
                    for (Student student : list) System.out.println(student.frontSort());
                    break;
                case 2:
                    for (Student student : list) System.out.println(student);
                    break;
                case 3:
                    for (Student student : list) System.out.println(student.backSort());
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }
            break;
        }
    }
}
