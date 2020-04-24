package xyz.williamw.behaviorval.factory.factorymethod;

import xyz.williamw.behaviorval.factory.basic.Operation;
import xyz.williamw.behaviorval.factory.basic.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
