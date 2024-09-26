package 생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음 ( void 불가 )
// 생성자는 외부에서 접근해야 하기 때문 일반적으로 public 접근 제한자를 사용

public class Television {
    private boolean isOn;       //전원 ON//OFF
    private int channel;        // 체널 설정
    private int volume;         // 볼륨 설정
    // 기본 생성자는 생성자가 없는 경우에 자동 생생 됨
    public Television() {}
}
