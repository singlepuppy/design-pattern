package xyz.williamw.behaviorval.factory.factorymethod;

import xyz.williamw.behaviorval.factory.basic.Operation;
import xyz.williamw.behaviorval.factory.basic.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
