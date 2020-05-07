package xyz.williamw.creational.prototype;

/**
 * @author William.W
 * @description 使用原型模式创建对象的用法
 * @date 2020/5/3 10:54:44
 */
public class Client{
    public static void main(String[] args) {
        Prototype p1 = new ConcretePrototype("I");
        Prototype c1 = p1.CLONE();

        System.out.println("克隆对象打印id：" + c1.getId());
    }
}
