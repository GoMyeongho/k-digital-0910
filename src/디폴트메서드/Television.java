package 디폴트메서드;

public class Television implements RemoteController{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        }
        else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }
}
