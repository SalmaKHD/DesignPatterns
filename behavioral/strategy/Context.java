package behavioral.strategy;

public class Context {
    int doOperation(Strategy strategy, int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
