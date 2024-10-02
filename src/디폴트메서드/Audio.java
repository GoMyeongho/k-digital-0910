package 디폴트메서드;

public class Audio implements RemoteController{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if ( volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        }
        else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        }
        else this.volume = volume;

    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오의 무음처리를 해제합니다.");
    }
}
