package xyz.williamw.creational.prototype;

/**
 * @author William.W
 * @description 具体的原型类
 * @date 2020/4/28 09:42:42
 */
public class ConcretePrototype extends Prototype {
    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype CLONE() {
        try {
            // Tips：java Object类提供的clone方法是浅拷贝，而且必须实现Cloneable接口才可以调用
            Prototype clone = (Prototype)this.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
