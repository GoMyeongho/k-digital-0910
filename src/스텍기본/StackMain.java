package 스텍기본;
import java.util.*;

// Stack 은 LIFO(Last In First Out) : 프로그래밍에서는 함수 호출 구조가 대표적인 예
// 일상생활에서의 예는 접시 쌓기
// Stack은 내부적으로 Vector 클래스를 상속 받아서 사용
// push(객체) : 객체를 저장
// peek() : 스택의 최상위의 값 확인
// pop() : 스택의 최상위의 값 추출하면서 보여줌
// empty() : 스택이 비어있는지 확인

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());   // 최상위의 값 확인
        System.out.println(stack.pop());    // 최상위의 값을 추출하면서 보여 줌
        System.out.println(stack.empty());  // 스텍이 비어 있는지 확인
        System.out.println(stack.size());   // 스텍에 포함된 요소의 개수
        System.out.println(stack.contains(1));  //스텍 내에 해당 값이 존재하는지 확인
    }
}
