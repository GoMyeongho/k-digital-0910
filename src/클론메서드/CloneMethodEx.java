package 클론메서드;
// clone() : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환 (얕은 복사가 발생하는 경우)
// 얕은 복사 : 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사되고,
// 참조 타입의 경우 참조하는 곳의 주소가 복사

public class CloneMethodEx {
    public static void main(String[] args) {
        Member mem1 = new Member("100","go","001",26,true);
        /*
        Member mem2 = mem1;     // 얕은 복사가 일어남
         */
        Member mem2 = mem1.getMember();
        mem2.id = "test1234";
        mem2.name = "my";

        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);

        System.out.println("ID : " + mem1.id);
        System.out.println("ID : " + mem2.id);
    }
}
