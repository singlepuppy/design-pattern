package xyz.williamw.behaviorval.factory.factorymethod;

import xyz.williamw.behaviorval.factory.basic.Operation;

public interface IFactory {
    /**
     * 创建Product
     * @return
     */
    Operation createOperation();
}
