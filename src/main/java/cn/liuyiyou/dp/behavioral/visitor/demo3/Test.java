package cn.liuyiyou.dp.behavioral.visitor.demo3;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午6:19
 */
public class Test {

    public static void main(String[] args) {
        // 具体主题角色通常用具体自来来实现
        ConcreteSubject subject = new ConcreteSubject();

        Observer o1 = new ConcreteObserver(subject, "Observer A");
        Observer o2 = new ConcreteObserver(subject, "Observer B");
        Observer o3 = new ConcreteObserver(subject, "Observer C");
        Observer o4 = new ConcreteObserver(subject, "Observer D");

        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);
        subject.registerObserver(o4);

        subject.setSubjectState("Ready");
        subject.notifyMessage();

        System.out.println();
        subject.removeObserver(o2);
        subject.notifyMessage();


    }
}
