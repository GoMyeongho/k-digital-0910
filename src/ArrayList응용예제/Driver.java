package ArrayList응용예제;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Order myOrder = new Order();
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        while (true) {
            System.out.println("\n==== 주문 관리 시스템 ====");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 제거");
            System.out.println("3. 제품 목록 보기");
            System.out.println("4. 제품 보기");
            System.out.println("5. 최종 가격 계산 (세금 포함)");
            System.out.println("6. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();
              // 버퍼 비우기
            switch (choice) {
                case 1:
                    System.out.print("추가할 제품 이름 입력 : ");
                    name = sc.next();
                    System.out.print("추가할 제품 가격 입력 : ");
                    price = sc.nextDouble();
                    myOrder.addItem(new Product(name, BigDecimal.valueOf(price)));
                    sc.nextLine();

                    continue;
                case 2:
                    System.out.print("제거할 제품 이름 입력 : ");
                    name = sc.next();
                    if (myOrder.removeItem(name)) System.out.println("상품 " + name + "을 제거 했습니다.");
                    else System.out.println("해당 상품이 존재하지 않습니다.");
                    sc.nextLine();
                    continue;
                case 3:
                    for (Product product : myOrder.products) {
                        System.out.println("=".repeat(30));
                        System.out.println("제품 이름 : " + product.getName());
                        System.out.println("제품 가격 : " + product.getPrice());
                        System.out.println("=".repeat(30));
                    }
                    // 엔터를 눌러야 화면이 넘어가게 만듦
                    sc.nextLine();
                    continue;
                case 4:
                    System.out.print("확인할 제품 이름 입력 : ");
                    name = sc.next();
                    Product product = myOrder.getItem(name);
                    if (product == null) System.out.println("해당 상품이 존재하지 않습니다.");
                    else{
                        System.out.println("=".repeat(30));
                        System.out.println("제품 이름 : " + product.getName());
                        System.out.println("제품 가격 : " + product.getPrice());
                        System.out.println("=".repeat(30));
                    }
                    sc.nextLine();
                    sc.nextLine();
                    continue;
                case 5:
                    System.out.print("세금(소수 형식) 입력 : ");
                    price = sc.nextDouble();
                    System.out.println("세금 포함 최종 가격 : " + myOrder.calculateFinalPrice(BigDecimal.valueOf(price)));
                    sc.nextLine();
                    sc.nextLine();
                    continue;
                case 6: break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;

            }
            break;
        }
    }
}
