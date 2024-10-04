package 중첩인터페이스;

public class Button {
    // OnClickListener 인터페이스에 대한 참조 변수, 외부에세 객체를 만들어서 주입하는 형태
    OnClickListener listener;   // OnClickListener 상속 받은 객체

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();     // 추상 메서드
    }
}
