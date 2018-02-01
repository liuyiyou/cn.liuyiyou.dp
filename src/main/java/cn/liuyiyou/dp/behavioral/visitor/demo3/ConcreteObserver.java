package cn.liuyiyou.dp.behavioral.visitor.demo3;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午6:13
 */
public class ConcreteObserver implements Observer {

    private String observerState;
    private String name;
    private ConcreteSubject subject;


    //具体观察者用一个具体主题来实现

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }



    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("The observer's state of "+ name +" is "+ observerState);
    }
}
