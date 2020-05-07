package xyz.williamw.behaviorval.templatemethod;

/**
 * @author William.W
 * @description 【试卷模板】
 * 父类，提供算法骨架
 * 其中发生变动的算法细节，在父类中使用抽象方法定义，在具体的子类中实现细节
 * @date 2020/5/7 11:46:31
 */
public abstract class PaperTemplate {
    public void questionA() {
        System.out.println("试题A...............");
        System.out.println("试题A的答案：" + answerA());
    }

    protected abstract String answerA();

    public void questionB() {
        System.out.println("试题B...............");
        System.out.println("试题B的答案：" + answerB());
    }

    protected abstract String answerB();

    public void questionC() {
        System.out.println("试题C...............");
        System.out.println("试题C的答案：" + answerC());
    }

    protected abstract String answerC();
}
