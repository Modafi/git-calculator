package operator;

public class Square implements ArithmeticOperator{
    @Override
    public boolean support(String operator) {
        return operator.equals("^");
    }

    @Override
    public int calc(int x, int y) {
        int returnValue = 1;

        for(int i=0; i<y; i++){
            returnValue*=y;
        }

        return returnValue;
    }
}
