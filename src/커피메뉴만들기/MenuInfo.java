package 커피메뉴만들기;

public class MenuInfo {
    private String name;
    private int price;
    private String category;
    private String description;        //상세 설명

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void getInfo(){
        System.out.println();
        System.out.println("=".repeat(30));
        System.out.println("    이름 : " + name);
        System.out.println("    가격 : " + price);
        System.out.println("카테고리 : " + category);
        System.out.println("    설명 : " + description);
        System.out.println("=".repeat(30));
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
