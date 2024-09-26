package 생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음 ( void 불가 )
// 생성자는 외부에서 접근해야 하기 때문 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근 제한자를 private해서 객체 생성을 제한 할 수 있음
// 체널은 1 ~ 999 유효한 값
// 볼륨 0 ~ 100
public class Television {
    private boolean isOn;       //전원 ON//OFF
    private int channel;        // 체널 설정
    private int volume;         // 볼륨 설정
    // 기본 생성자는 생성자가 없는 경우에 자동 생생 됨
    public Television() {
        isOn = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출");
    }
    public Television(boolean isOn, int channel, int volume) {
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
    }
    public void setOn(boolean onOff){
        isOn = onOff;
        String onOffstr = (isOn) ? "ON" : "OFF";
        System.out.println("TV : " + onOffstr);
    }
    public void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 999) {
            channel = cnl;
            System.out.println("체널을 " + channel + "로 변경 하였습니다.");
        }

    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "로 변경 하였습니다.");
        }
    }
    public void getTV() {
        String onOffstr = (isOn) ? "ON" : "OFF";
        System.out.println("=======TV 정보=======");
        System.out.println("전원 : " + onOffstr);
        System.out.println("체널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }
}
