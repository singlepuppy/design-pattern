package xyz.williamw.creational.factory.factorymethod;

import xyz.williamw.creational.factory.basic.Operation;

public class Client4MethodFactory {
    public static void main(String[] args) {
        // 比简单工厂模式多出一步————创建具体工厂对象；而简单工厂模式是直接传入参数吗，在工厂方法内部处理创造什么对象，使得唯一的工厂类与具体的产品类耦合在了一起
        IFactory iFactory = new AddFactory();
        Operation oper = iFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}


