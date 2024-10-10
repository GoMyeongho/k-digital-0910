package 단어정렬;

import java.util.*;

public class WordSortMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeSet<Word4Sort> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(new Word4Sort(sc.next()));
        }
        for (Word4Sort words : treeSet) System.out.println(words);
    }
}
