package Comparable실습문제;

import java.util.*;

// 5명의 학생에 대해 이름과 국어, 영어, 수학, 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전순 정렬
// 자료 구조는 TreeSet 을 사용해도 되고 ArrayList 를 사용해도 됨
// TreeSet 의 경우는 중복 제거가 되므로 유일한 키가 없는 경우 주의
public class StudentSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();


    /*
        students.add(new Student("이름1",50,60,70));
        students.add(new Student("이름2",30,20,60));
        students.add(new Student("이름3",54,89,79));
        students.add(new Student("이름4",100,100,100));
        students.add(new Student("이름",30,20,60));
        */

        for (int i = 0; i < 5; i++){
            System.out.print("학생 " + (i+1) + "번의 이름 입력 : ");
            String name = sc.next();
            System.out.print("학생 " + (i+1) + "번의 국어 성적 입력 : ");
            int korean = sc.nextInt();
            System.out.print("학생 " + (i+1) + "번의 영어 성적 입력 : ");
            int english = sc.nextInt();
            System.out.print("학생 " + (i+1) + "번의 수학 성적 입력 : ");
            int math = sc.nextInt();
            students.add(new Student(name, korean, english, math));
        }
        students.sort(Student::compareTo);
        for (Student student : students) System.out.println(student);

    }
}
