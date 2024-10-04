package 익명객체;

public class AnonymousEx {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodParent();
        Child2 child2 = new Child2();
        child2.parent.methodParent();

    }
}

class Parent {
    String name = "Parent Class";
    void methodParent() {
        System.out.println("Parent method : " + this.name);
    }
}
class Child2 {
    Parent parent = new Parent() {
        int childfield;
        void methodChild() {
            System.out.println("자식이 별도로 만든 메서드");
        }
        @Override
        void methodParent() {
            System.out.println("부모의 메서드를 오버라이딩!!!!");
        }
    };
}

class Child extends Parent {
    String name = "Child Class";
    @Override
    void methodParent() {
        System.out.println("class name(Child) : " + this.name);
        System.out.println("class name(Parent) : " + super.name);
    }
}
