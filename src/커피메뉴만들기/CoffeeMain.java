package 커피메뉴만들기;

import java.util.*;

public class CoffeeMain {
    static Map<String, MenuInfo> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
    }
    static void selectMenu() {
        String key, category, description;
        int price, choice;
        while(true) {
            System.out.println("메뉴를 선택하세요 : ");
            System.out.println("[1] 메뉴 보기, [2] 메뉴 조회, [3] 메뉴 추가\n[4] 메뉴 삭제, [5] 메뉴 수정, [6] 종료");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("=".repeat(10) + "메뉴 리스트 보기" + "=".repeat(10));
                    // keySet() 반복순회
                    for (String k : map.keySet()) map.get(k).getInfo();
                    System.out.println("\n계속하려면 enter 키를 입력하시오");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("=".repeat(10) + "메뉴 조회하기" + "=".repeat(10));
                    System.out.print("조회할 메뉴 이름 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) map.get(key).getInfo();
                    else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    sc.nextLine();
                    System.out.println("\n계속하려면 enter 키를 입력하시오");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("=".repeat(10) + "메뉴 추가하기" + "=".repeat(10));
                    // 키와 값을 입력 받아서 put()
                    System.out.print("추가할 메뉴 이름 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("\n해당 메뉴가 이미 존재합니다.");
                        sc.nextLine();
                    }
                    else {
                        System.out.print("추가할 메뉴 가격 입력 : ");
                        price = sc.nextInt();
                        System.out.print("추가할 메뉴 카테고리 입력 : ");
                        category = sc.next();
                        sc.nextLine();
                        System.out.print("추가할 메뉴 설명 입력 : ");
                        description = sc.nextLine();
                        map.put(key,new MenuInfo(key,price,category,description));
                        System.out.println(key + " 메뉴를 추가 하였습니다.");
                    }
                    System.out.println("\n계속하려면 enter 키를 입력하시오");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("=".repeat(10) + "메뉴 삭제하기" + "=".repeat(10));
                    // containsKey(키) 해당 키 존재여부 확인하고 있으면, remove(key)
                    System.out.print("제거할 메뉴 이름 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");
                    }
                    else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    sc.nextLine();
                    System.out.println("\n계속하려면 enter 키를 입력하시오");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("=".repeat(10) + "메뉴 수정하기" + "=".repeat(10));
                    System.out.print("수정할 메뉴 이름 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("수정할 메뉴 가격 입력 : ");
                        price = sc.nextInt();
                        System.out.print("수정할 메뉴 카테고리 입력 : ");
                        category = sc.next();
                        sc.nextLine();
                        System.out.print("수정할 메뉴 설명 입력 : ");
                        description = sc.nextLine();
                        map.put(key,new MenuInfo(key,price,category,description));
                        System.out.println(key + " 메뉴를 수정 하였습니다.");
                    }
                    else {
                        System.out.println("\n해당 메뉴가 존재하지 않습니다.");
                        sc.nextLine();
                    }
                    System.out.println("\n계속하려면 enter 키를 입력하시오");
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
