package 아이패드주문;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {

        while (true){
            IPadClass iPadPro = new IPadClass("iPad Pro");
            if (iPadPro.continueOrder()) break;
            iPadPro.setDisplay();
            iPadPro.setColor();
            iPadPro.setStorage();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.iPadProCalcPrice();
            iPadPro.progressIPadPro();
            iPadPro.iPadProInfo();
        }
    }
}
