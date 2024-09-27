package 슈퍼메서드;
// super() : 부모의 생성자 호출
// super : 부모의 객체를 참조하는 변수
// this : 자기 자신의 객체를 참조하는 변수
public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child(30);
        child.childMethod();
    }

}

class Parent {
    int x = 10;
    Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    // 자식 클래스 생성자를 만들지 않아도 되는 이유
    // 부모의 클래스 생성 시 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어짐
    // 기본 생성자는 별도로 호출하지 않아도 자동으로 불려짐
    int x = 20;
    Child(int x) {
        super(x);
    }
    void childMethod() {
        System.out.println(x);      // 20
        System.out.println(this.x); // 20
        System.out.println(super.x);// 10 ==> 30
    }
}




