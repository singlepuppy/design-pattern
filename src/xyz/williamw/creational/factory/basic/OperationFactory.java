package xyz.williamw.creational.factory.basic;

public class OperationFactory {
    public static Operation oper;
    public static Operation createOperation(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();break;
            case "-":
                oper = new OperationSub();break;
            case "*":
                oper = new OperationMul();break;
            case "/":
                oper = new OperationDiv();break;
        }
        return oper;
    }
}
