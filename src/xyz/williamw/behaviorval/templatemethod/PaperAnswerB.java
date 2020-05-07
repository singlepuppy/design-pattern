package xyz.williamw.behaviorval.templatemethod;

/**
 * @author William.W
 * @description 学生B的答题卷
 * @date 2020/5/7 11:48:24
 */
public class PaperAnswerB extends PaperTemplate{
    @Override
    protected String answerA() {
        return "啊";
    }

    @Override
    protected String answerB() {
        return "咦";
    }

    @Override
    protected String answerC() {
        return "哦";
    }
}
