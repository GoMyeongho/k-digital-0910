package 자바파이널과제;

public class Student implements Comparable<Student>{
    private String name;
    private int[] score = new int[3];

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.score[0] = kor;
        this.score[1] = eng;
        this.score[2] = math;
    }
    public int getTotal() {
        return score[0] + score[1] + score[2];
    }

    @Override
    public int compareTo(Student o) {// 분류기준을 삼중연산자 사용으로 표현
        return (this.getTotal() != o.getTotal()) ? o.getTotal() - this.getTotal() : this.name.compareTo(o.name);
    }
    @Override
    public String toString() { // 결과 출력을 위한 toString 오버라이드 줄맞춤을 위해 repeat 사용 기본은 가운데 정렬
        return "이름 :" +" ".repeat(5 - name.length()) +  name + " ".repeat(5 - name.length())+": " + getTotal();
    }
    public String frontSort() {
        return "이름 : " + name + " ".repeat(10 - name.length() * 2)+": " + getTotal();
    }
    public String backSort() {
        return "이름 :" +" ".repeat(10 - name.length() * 2) +  name + " : " + getTotal();
    }

}
