package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;
import xyz.williamw.creational.factory.basic.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
