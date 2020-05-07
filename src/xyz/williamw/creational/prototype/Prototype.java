package xyz.williamw.creational.prototype;

/**
 * @author William.W
 * @description 原型抽象类
 * @date 2020/4/28 09:26:14
 */
abstract class Prototype implements Cloneable{
    private String id;

    public Prototype(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 根据当前对象克隆新对象
     *
     * @return
     */
    public abstract Prototype CLONE();
}
