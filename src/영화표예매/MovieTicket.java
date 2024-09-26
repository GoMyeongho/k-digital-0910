package 영화표예매;

public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성
    int[] seat = new int[10];
    // 좌석당 가격에 대한 인스턴스 필드
    int price;
    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 되므로 매개변수가 있는 생성자 필요
    MovieTicket(int price){
        this.price = price;
    }
    // 좌석 상태 표시 메서드 구현
    public void seatCondtion() {
        for (int e:seat){
            if (e == 1) System.out.print("[V]");
            else System.out.print("[V]");
        }
    }
    // 좌석 예약 메서드 구현

    // 총 판매 금액 메서드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과를 반환)

}
