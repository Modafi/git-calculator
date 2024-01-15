public class Add implements ArithmeticOperator{
    @Override
    public boolean support(String operator) {
        return operator.equals("+");
    }

    @Override
    public boolean calc(int x, int y) {
        return x + y;
    }
}