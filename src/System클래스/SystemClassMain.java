package System클래스;

import static java.lang.Thread.sleep;

// System 클래스 : 표준 입 / 출력 관련, 시스템 정보 관련 메서드 제공
public class SystemClassMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1;
        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long start = System.currentTimeMillis();
        // 1970년 1월1일 0시0분부터 현재까지 경과시간을 밀리초 단위로 넘겨줌
        for(i=0; i<data.length;i++){
            cnt++;
            sleep(1);
            if (randVal == data[i]){
                System.out.println("위치 : " + (i+1));
                break;
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (end - start) + "밀리초 입니다");
    }
}
