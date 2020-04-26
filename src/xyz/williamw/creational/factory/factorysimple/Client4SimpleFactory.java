package xyz.williamw.creational.factory.factorysimple;

import xyz.williamw.creational.factory.basic.Operation;
import xyz.williamw.creational.factory.basic.OperationFactory;

/**
 * @author Dr_King
 */
public class Client4SimpleFactory {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}
