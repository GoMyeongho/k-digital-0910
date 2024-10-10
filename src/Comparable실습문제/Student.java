package Comparable실습문제;

public class Student implements Comparable<Student>{
    private String name;
    private int[] score;

    public int getTotalScore() {
        int sum = 0;
        for (int e: score)  sum += e;
        return sum;
    }
    
    @Override
    public int compareTo(Student o) {
        /*
        if (this.getTotalScore() < o.getTotalScore()) return 1;
        else if (this.getTotalScore() == o.getTotalScore()) return this.name.compareTo(o.name);
        return -1;
         */
        return (this.getTotalScore() == o.getTotalScore()) ? this.name.compareTo(o.name) : o.getTotalScore() - this.getTotalScore();
    }

    @Override
    public String toString() {
        return "이름 : " + name + " : " + getTotalScore();
    }

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        score = new int[3];
        score[0] = korean;
        score[1] = english;
        score[2] = math;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
