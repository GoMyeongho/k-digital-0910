package Comparable;

// Comparable : 나와 다른 객체를 비교할 때 사용
public class Car implements Comparable<Car> {
    private String name;
    private int year;
    private String color;

    @Override
    public int compareTo(Car o) {
        if (this.year == o.year) { // 연식이 같으면
            int rst = this.name.compareTo(o.name); // 모델이름 사전순 정렬
            if (rst == 0) rst = this.color.compareTo(o.color); // 비교 조건에 대한 반환값이 0이면 중복 제거가 됨
            return rst;
        }
        else if (this.year > o.year) return 1; // 오름차순 정렬 연식이 오래된거부터 출력
        else return -1;
    }

    public Car(String name, int year, String color) {
        this.color = color;
        this.year = year;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
