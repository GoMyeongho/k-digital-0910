package 스텍응용;

import java.util.*;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법

public class StackExMain {
    public static void main(String[] args) {
        // Character 는 char 의 객체타입
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);    // 문자열에서 인덱스에 해당하는 문자를 반환
            if (ch == '(') st.push(ch);    //추출된 문자가 열림괄호면 Stack 에 문자 추가
            else if (ch == ')') {
                if(!st.empty()) st.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }

        }
        if (st.empty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
