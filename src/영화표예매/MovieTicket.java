package 영화표예매;

import java.util.Collection;
import java.util.Collections;

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
            String seatCheck = (e == 1) ? "[V]" : "[ ]";
            System.out.print(seatCheck);
        }
        System.out.println();
    }
    // 좌석 예약 메서드 구현
    public void reserveSeat(int seatNum) {
        seatNum--;
        if (seat[seatNum] == 1) {
            System.out.println("이미 예매된 좌석입니다.");
        }
        else {
            System.out.println("예매 완료했습니다.");
            seat[seatNum] = 1;
            seatCondtion();
        }

    }
    public void cancelSeat(int seatNum) {
        seatNum--;
        if (seat[seatNum] == 0) {
            System.out.println("예매되지 않은 좌석입니다.");
        }
        else {
            System.out.println("취소 완료했습니다.");
            seat[seatNum] = 0;
            seatCondtion();
        }

    }
    // 총 판매 금액 메서드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과를 반환)
    public int totalPay() {
        int seatCount = 0;
        for (int e:seat){
            if (e == 1) seatCount++;
        }
        return price * seatCount;
    }
}
