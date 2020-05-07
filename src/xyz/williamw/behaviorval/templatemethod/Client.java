package xyz.williamw.behaviorval.templatemethod;

/**
 * @author William.W
 * @description 模板方法模式客户端
 * @date 2020/5/7 11:56:44
 */
public class Client {
    public static void main(String[] args) {
        PaperTemplate pA = new PaperAnswerA();
        pA.questionA();
        pA.questionB();
        pA.questionC();

        PaperTemplate pB = new PaperAnswerB();
        pB.questionA();
        pB.questionB();
        pB.questionC();
    }
}
