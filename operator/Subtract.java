package operator;

public class Subtract implements ArithmeticOperator{
    @Override
    public boolean support(String operator) {
        return operator.equals("-");
    }

    @Override
    public int calc(int x, int y) {
        return 0;
    }
}
