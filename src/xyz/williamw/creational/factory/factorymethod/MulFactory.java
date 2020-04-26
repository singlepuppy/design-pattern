package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;
import xyz.williamw.creational.factory.basic.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
