import operator.ArithmeticOperator;

import java.util.List;

public class Calculator {
    private final List<ArithmeticOperator> operators;

    public Calculator() {
        this.operators = List.of();
    }

    public int calculator(int x, String operator, int y) {
        ArithmeticOperator operatorObj = operators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.support(operator))
                .findFirst()
                .orElseThrow(UnsupportedOperationException::new);

        return operatorObj.calc(x, y);
    }
}
