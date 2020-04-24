package xyz.williamw.behaviorval.factory.factorysimple;

import xyz.williamw.behaviorval.factory.basic.Operation;
import xyz.williamw.behaviorval.factory.basic.OperationFactory;

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
