package 스레드종료;
// 스레드의 안전한 종료 : 원래는 stop()이라는 매서드가 존재했지만 현재는 사용중지
// 대체 방법으로는
// 1. stop 플래그를 사용하는 방식
// 2. Interrupt()를 거는 방식

public class ThreadStopEx {
    public static void main(String[] args) throws InterruptedException {

        /*
        RunThread subThread1 = new RunThread();
        subThread1.start();
        Thread.sleep(200);
        subThread1.setStop(true);
         */

        InterruptThread subThread2 = new InterruptThread();
        subThread2.start();
        Thread.sleep(1000);
        subThread2.interrupt();

    }
}
// stop 플래그 사용하는 방식
class RunThread extends Thread {
    private boolean stop;   // stop 플래그를 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread 실행 중......");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }

}
class InterruptThread extends Thread {
    @Override
    public void run() {
        int cnt = 0;
        try {
            while (true) {
                System.out.println("Thread 실행 중......");
                Thread.sleep(1);
                cnt++;
            }
        } catch (InterruptedException e) {
            System.out.println(e + "예외 발생!!!!");
        }
        System.out.println(cnt);
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
