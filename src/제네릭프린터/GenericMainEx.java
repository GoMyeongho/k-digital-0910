package 제네릭프린터;

public class GenericMainEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
        System.out.println(plastic);

        //GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        // Material 의 자식 클래스가 아니기 때문에 넣을 수 없다.
    }
}
