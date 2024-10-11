package 동기화;
// 동기화 (Synchronized) : 한번에 한개의 스레드만 공유자원에 접근 할 수 있도록
// 락(Lock)을 걸어서 다른 스레드가 진행중인 작업을 간섭하지 못하도록 하는 것
public class SyncMainEx {
    public static void main(String[] args) {
        ShareThread shareThread = new ShareThread();
        Thread thread1 = new Thread(() -> {
            shareThread.setValue(100);
        });
        Thread thread2 = new Thread(() -> {
            shareThread.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();

        // 싱크로나이즈 처리한 코드
        SynchronizedThread st = new SynchronizedThread();
        Thread thread3 = new Thread(() -> {
            st.setValue(100);
        });
        Thread thread4 = new Thread(() -> {
            st.setValue(10);
        });
        thread3.setName("쓰레드 3");
        thread4.setName("쓰레드 4");
        thread3.start();
        thread4.start();
    }
}
class ShareThread{
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e ) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +
                "의 Value 값은 " + this.value + " 입니다.");
    }
}
class SynchronizedThread{
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +
                "의 Value 값은 " + this.value + " 입니다.");
    }
}