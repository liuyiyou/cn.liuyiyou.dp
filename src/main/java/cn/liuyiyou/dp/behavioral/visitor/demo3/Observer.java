package cn.liuyiyou.dp.behavioral.visitor.demo3;

/**
 * 抽象观察者类，为所有具体观察者定义一个接口，在得到通知时更新自己
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午6:03
 */
public interface Observer {

    void update();
}
