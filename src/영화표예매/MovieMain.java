package 영화표예매;
// 예매하기와 종료하기 메뉴 작성
// 극장의 총 좌석은 10개 입니다.
// 각 좌석당 판매 가격은 12000원 입니다. (판매 금액은 생성자를 통해서 정의)
// 좌석 정보에 대한 메서드 작성 ([ ][ ][ ][ ][V][ ][ ][ ][ ][ ])
// 좌석 예약 하기 : 값이 0이면 예약 안된 좌석 1이면 판매된 좌석
// 총 판매 금액에 대한 매서드 작성


import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성
        MovieTicket alien = new MovieTicket(12000);
        // 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 메뉴 작성은 무한 반복문으로 구현
        while(true){
            System.out.println("[1] 좌석 예약확인");
            System.out.println("[2] 좌석 예약하기");
            System.out.println("[3] 좌석 취소하기");
            System.out.println("[4] 종료하기");
            int sel = sc.nextInt();
            if (sel == 1) alien.seatCondtion();
            else if (sel == 2){
                System.out.print("예약할 좌석번호를 입력 : ");
                int seatNum = sc.nextInt();
                alien.reserveSeat(seatNum);
            }
            else if (sel == 3) {
                System.out.print("취소할 좌석번호를 입력 : ");
                int seatNum = sc.nextInt();
                alien.cancelSeat(seatNum);
            }
            else if (sel == 4) {
                alien.seatCondtion();
                System.out.println("총 판매 금액 : " + alien.totalPay());
                break;
            }
            else System.out.println("잘못된 입력입니다.");
        }
        // 1. 좌석 예약하기
        // 2. 총 판매 금액 표시하고 종료
    }
}
