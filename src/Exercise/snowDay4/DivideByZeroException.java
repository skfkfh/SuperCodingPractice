package Exercise.snowDay4;

public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
