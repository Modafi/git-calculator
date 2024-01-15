package operator;

public interface ArithmeticOperator {
    boolean support(String operator);
    int calc(int x, int y);
}
