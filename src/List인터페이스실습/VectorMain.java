package List인터페이스실습;
// Vector 는 ArrayList 와 동일한 내부 구조를 가짐
// 차이점은 동기화(Synchronized) 메서드로 구성되어 있어 멀티 스레드 환경에서 안전

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        //List<NameCard> list = new ArrayList<>();  똑같이 동작함
        list.add(new NameCard("민지","minji@gmail.com","010-1234-5678","뉴진스"));
        list.add(new NameCard("하니","hani@gmail.com","010-2345-6789","뉴진스"));
        list.add(new NameCard("혜린","hyerin@gmail.com","010-3456-7890","뉴진스"));
        list.add(new NameCard("혜인","hyein@gmail.com","010-4567-8901","뉴진스"));
        list.add(new NameCard("다니엘","daniel@gmail.com","010-5678-9012","뉴진스"));
        for (NameCard e: list) e.getInfo();
    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
    public void getInfo() {
        System.out.println("=".repeat(30));
        System.out.println("    이름 : " + name);
        System.out.println("  이메일 : " + email);
        System.out.println("전화번호 : " + phone);
        System.out.println("    직업 : " + job);
        System.out.println("=".repeat(30));

    }
}
