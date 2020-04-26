package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;

public interface IFactory {
    /**
     * 创建Product
     * @return
     */
    Operation createOperation();
}
