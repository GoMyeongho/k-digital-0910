package 명령어이력조회;

import java.util.*;


public class QueueHistoryEx {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;     // 큐의 크기를 10으로 잡음
    public static void main(String[] args) {
        QueueHistoryEx history = new QueueHistoryEx();
        Scanner sc = new Scanner(System.in);
        System.out.println("'help' 를 입력하면 도움말을 볼 수 있습니다");
        while (true) {
            System.out.print("$ ");
            String cmd = sc.nextLine().trim();  // 입력 받은 문자열의 앞 / 뒤 공백을 제거
            if (cmd.equalsIgnoreCase("q")) {    // 대소문자 구분하지 않음
                System.exit(0); // 프로그램 강제 종료
            }
            else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여줍니다");
                System.out.println("q/Q - 프로그램을 종료합니다");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            }
            else if (cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 1;
                for (String e : history.queue) System.out.println(cnt++ + " " + e);
            }
            else {
            history.save(cmd);
            System.out.println(cmd);
            }
        }


    }
    void save(String cmd) {
        queue.offer(cmd);
        if (queue.size() > MAX_SIZE) queue.remove();
    }
}
