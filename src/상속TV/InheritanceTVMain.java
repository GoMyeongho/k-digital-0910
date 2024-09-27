package 상속TV;

public class InheritanceTVMain {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(30);
        lgTV.setChannel(30, true);
        lgTV.tvInfo();
        PrototypeTV samTV = new ProductTV("남의 집 TV");
        samTV.setChannel(1900);
    }
}
