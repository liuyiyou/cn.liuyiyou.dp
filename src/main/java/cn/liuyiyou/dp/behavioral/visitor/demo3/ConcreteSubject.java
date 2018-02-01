package cn.liuyiyou.dp.behavioral.visitor.demo3;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午6:10
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    /// 具体观察者的状态
    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
