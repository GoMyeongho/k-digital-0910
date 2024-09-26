package 회원정보_예제;

public class MemberInfoEx {
    public static void main(String[] args) {
        // Member 클래스에 대한 객체를 생성하기 위해 기본 생성자 호출
        Member member = new Member();
        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();
    }
}
