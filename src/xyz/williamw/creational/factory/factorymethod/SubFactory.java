package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;
import xyz.williamw.creational.factory.basic.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
