package 단어정렬;

public class Word4Sort implements Comparable<Word4Sort>{
    String word;
    @Override
    public int compareTo(Word4Sort o) {
        return (this.word.length() == o.word.length()) ? this.word.compareTo(o.word) : this.word.length() - o.word.length();
    }

    @Override
    public String toString() {
        return word;
    }
    public Word4Sort(String word) {
        this.word = word;
    }

}
