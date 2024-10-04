package 다운캐스팅;


import java.util.ArrayList;
import java.util.List;

// 다운캐스팅 : 상위 클래스 형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것
// 인스턴스 instanceof 클래스 : 형변환 가능 여부를 확인
public class DownCastingEx {
    // Animal타입의 요소로 이루어진 ArrayList 선언
    List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        DownCastingEx downCast = new DownCastingEx();
        downCast.addAnimal();
        downCast.downCasting();
    }
    public void addAnimal() {
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new Human());
        animals.add(new Eagle());

        //for (Animal e : animals) e.move();
    }
    public void downCasting() {
        for (int i = 0; i < animals.size(); i++) {
            Animal ani = animals.get(i); // ArrayList 해당 인덱스의 값을 가져옴
            if(ani instanceof Human) {
                Human h = (Human) ani;  // 다운캐스팅은 명시적 형변환 필요
                h.readBook();
            }
            else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            }
            else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }
            else System.out.println("지원되지 않는 형입니다.");

        }
    }

}
