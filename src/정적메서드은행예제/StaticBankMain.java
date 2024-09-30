package 정적메서드은행예제;
// static 맴버와 메서드는 클래스 생성시 함께 생성되고, 객체 생성 시에는 만들어지지 않음
// 하나의 클래스에선 한개만 존재
// 한번 생성되면 프로그램 종료 시까지 사라지지 않음
// 정적 메서드에서는 인스턴스 필드나 메서드를 사용할 수 없음


public class StaticBankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhna = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank() + "에 " + kakao.getAccount() + "원이 있습니다.");
        System.out.println("계좌가 " + Bank.getCount() + "개 개설되었습니다. ");

        System.out.println((Util.max(100,200)));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
