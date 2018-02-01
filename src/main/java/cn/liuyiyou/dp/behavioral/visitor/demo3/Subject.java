package cn.liuyiyou.dp.behavioral.visitor.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题：它把所有观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午6:02
 */
public abstract  class  Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    /// 增加观察者
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    /// 移除观察者
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    /// 向观察者（们）发出通知
    public void notifyMessage()
    {
        for (Observer observer :observers)
        {
            observer.update();
        }
    }

}
