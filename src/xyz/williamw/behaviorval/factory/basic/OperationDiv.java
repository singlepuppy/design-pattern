package xyz.williamw.behaviorval.factory.basic;

public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = this.numberA / this.numberB;
        return result;
    }
}
