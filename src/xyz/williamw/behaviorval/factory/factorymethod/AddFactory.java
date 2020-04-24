package xyz.williamw.behaviorval.factory.factorymethod;

import xyz.williamw.behaviorval.factory.basic.Operation;
import xyz.williamw.behaviorval.factory.basic.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
