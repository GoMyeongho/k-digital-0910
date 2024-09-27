package 아이패드주문;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static 아이패드주문.Common.*;

import static java.lang.Thread.sleep;

public class IPadClass {
    private final int[] displaystr = {0, 11, 13};
    private final String[] colorstr = {"", "스페이스그레이", "실버"};
    private final int[] storagestr = {0, 256, 512, 1024, 2048};
    private final String[] networkstr = {"", "Wi-Fi", "Cellular + Wi-Fi"};

    private final int[] displayPrice = {0,1499000,1999000};
    private final int[] storagePrice = {0,0,300000,900000,1500000};
    private final int[] networkPrice = {0, 0, 300000};

    private int display;
    private int color;
    private int storage;
    private int network;
    private Scanner sc;
    private String name;
    private String productDate;
    private static int cnt = 0;
    private int price;      // 제품 구매 가격
    private String serialNum;
    
    public IPadClass(String name) {
        this.sc = new Scanner(System.in);
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);  //지정된 format 형태로 시간정보가 가공되서 반환됨
        cnt++;
        productDate += cnt;     // 산술 연산이 아니고 문자열을 연결 함
    }

    public boolean continueOrder() {
        System.out.println("======== iPad Pro 구입하기 ========");
        System.out.println("구입을 진행하시려면 yes , 종료는 no : ");
        String isContinue = sc.next();
        return isContinue.equalsIgnoreCase("no");
    }

    public void setDisplay() {
        while(true) {
            System.out.println("화면 크기를 고르시오 : ");
            System.out.println("[1] 11인치  [2] 13인치");
            display = sc.nextInt();
            if (display == 1 || display == 2) return;
            System.out.println("잘못된 입력입니다.");
        }
    }
    public void setColor() {
        while(true) {
            System.out.println("색깔을 고르시오 : ");
            System.out.println("[1] 스페이스 그레이  [2] 실버");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("잘못된 입력입니다.");
        }

    }
    public void setStorage() {
        while(true) {
            System.out.println("용량을 고르시오 : ");
            System.out.println("[1] 256GB  [2] 512GB  [3] 1TB  [4] 2TB");
            storage = sc.nextInt();
            if (storage >= 1 && storage <= 4) return;
            System.out.println("잘못된 입력입니다.");
        }

    }
    public void setNetwork() {
        while(true) {
            System.out.println("네트워크를 고르시오 : ");
            System.out.println("[1] Wi-Fi  [2] Cellular + Wi-Fi");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("잘못된 입력입니다.");
        }

    }
    public void setName() {
        System.out.println("각인을 하시겠습니까? ");
        System.out.println("[1] 네  [2] 아니요");
        int isName = sc.nextInt();
        if (isName == 1){
            System.out.println("이름을 입력하시오 : ");
            name = sc.next();
        }

    }
    // 일련번호 만들기
    public void setSerialNum() {
        serialNum = "iPad" + displaystr[display] + storagestr[storage]
                + networkstr[network].charAt(0) + productDate;
    }
    // 제품 옵션 선택이 완료되면 출고까지 30초 동안 제품 생산 진행 상황을 보여주고 출고
    public void progressIPadPro() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(200); // 0.3초
            cnt++;
            System.out.printf("<< iPadPro 제작 중 : [%d%%] >>\r",cnt);
            if (cnt >= 100) break;
        }
    }
    //제품의 선택 옵션과 일련번호 총 가격
    public void iPadProInfo() {
        System.out.println("====== 주문 내역 ======");
        System.out.println("화면 크기 : " + displaystr[display] + "인치");
        System.out.println("색상 : " + colorstr[color]);
        if (storage < 3){
            System.out.println("용량 : " + storagestr[storage] + "GB");}
        else {
            System.out.println("용량 : " + storagestr[storage]/1000 + "TB");}
        System.out.println("네트워크 : " + networkstr[network]);
        System.out.println("이름 : " +  name);
        System.out.println("일련 번호 : " + serialNum);
        System.out.println("가격 : " + price);
    }
    // 선택한 옵션을 포함한 제품 가격 구하기
    public void iPadProCalcPrice() {
        price = displayPrice[display] + storagePrice[storage] + networkPrice[network];
    }
}
