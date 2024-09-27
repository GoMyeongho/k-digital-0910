package 상속TV;

import static 아이패드주문.Common.*;

public class PrototypeTV {

    boolean isPower;
    protected int channel;
    protected int volume;
    public PrototypeTV(){}
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if (cnl > CHANNEL_MIN && cnl < PROTOTYPE_CHANNEL_MAX) {
            channel = cnl;
        }
        else System.out.println("잘못된 입력입니다.");
    }
}
