package 디폴트메서드;

public interface RemoteController {
    int MAX_VOLUME = 100;       // 인터페이스에 포함된 필드는 모두 상수로 만들어 짐(final static)
    int MIN_VOLUME = 0;         // 설계명세에서 볼륨의 설정 범위를 표시하기 위해서 사용 할 수 있음
    public void turnON();  //자동으로 public abstract가 추가 됨
    public void turnOFF();
    public void setVolume(int volume);

    // 상속 받은 클래스에서 오버라이딩 해도 되고, 하지 않아도 됨
    default void setMute(boolean mute) {
        if (mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음처리를 해제합니다.");
    }
    // 인터페이스 생성 시 함께 생성되고 상속되지 않음
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
