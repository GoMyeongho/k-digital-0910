package 싱글톤;

public class Student {
    Singleton singleton = Singleton.getSingleton(); // 이미 만들어진 싱글톤 객체의 주소를 대입
    void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;
    }
    void viewInfo() {
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);
    }
}
