package xyz.williamw.behaviorval.templatemethod;

/**
 * @author William.W
 * @description 学生A的答题卷
 * @date 2020/5/7 11:48:24
 */
public class PaperAnswerA extends PaperTemplate{
    @Override
    protected String answerA() {
        return "a";
    }

    @Override
    protected String answerB() {
        return "b";
    }

    @Override
    protected String answerC() {
        return "c";
    }
}
