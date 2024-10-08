package Set인터페이스;

import java.util.*;

public class SetMainEx {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "O"));
//        System.out.println(set);

        HashSet<Member> hashset = new HashSet<>();
        hashset.add(new Member(1001, "유나"));
        hashset.add(new Member(1002, "채원"));
        hashset.add(new Member(1003, "지수"));
        hashset.add(new Member(1003, "카리나"));
        for (Member e : hashset) e.showMember();
    }
}
class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return this.id == member.id;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        }
    public void showMember() {
        System.out.println("  id : " + id);
        System.out.println("이름 : " + name);
    }
}

