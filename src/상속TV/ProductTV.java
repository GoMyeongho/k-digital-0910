package 상속TV;

import static 아이패드주문.Common.*;

public class ProductTV extends PrototypeTV{
    String name;
    boolean isInternet;     // 인터넷 기능을 ON / OFF
    public ProductTV(String name) {
        super(false,10,10);// super()는 부모의 생성자를 호출
        this.name = name;       // 순서 중요
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    public void setVolume(int vol) {
        if (vol >= MIN_VOLUME && vol <= MAX_VOLUME) {
            volume = vol;
        }
        else System.out.println("잘못된 입력입니다.");
    }
    @Override
    public void setChannel(int cnl) {
        if (cnl > CHANNEL_MIN && cnl < PRODUCT_CHANNEL_MAX) {
            channel = cnl;
            System.out.println("체널을 " + channel + "로 변경했습니다");
        }
        else System.out.println("잘못된 입력입니다.");
    }
    //오버로딩
    public void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        }
        else{
            this.isInternet = false;
            this.setChannel(cnl);
        }
    }
    public void tvInfo() {
        System.out.println("이름 : " + name);
        System.out.print("전원 : ");
        if (isPower) System.out.println("ON");
        else System.out.println("OFF");
        System.out.println("체널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : ");
        if (isInternet) System.out.println("ON");
        else System.out.println("OFF");


    }

}
