package Enum클래스;
// 열거형 : 특수한 상수들의 집합 (이 중에서 한개의 값을 선택하는 구조)
//

import java.util.Calendar;

public class EnumClassEx {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);   //주에서 몇번째 날인지
        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }
        System.out.println("오늘의 요일은 "+ today);
    }
}

enum Week  {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

