package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;
import xyz.williamw.creational.factory.basic.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
