package 제네릭프린터;

public class Nylon{

    public void doPrinting(){
        System.out.println("Nylon 재료로 출력 합니다");
    }
    @Override
    public String toString() {
        return "재료는 Nylon 입니다.";
    }
}
