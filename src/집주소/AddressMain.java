package 집주소;

import java.util.ArrayList;
import java.util.List;

public class AddressMain {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>(List.of());
        while (true) {
            String num = Address.sc.nextLine();
            if (num.equals("0")) break;
            ans.add(Address.calcWidth(num));
        }
        for (int e : ans) System.out.println(e);
    }

}
