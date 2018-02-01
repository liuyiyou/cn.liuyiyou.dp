package cn.liuyiyou.dp.creational.singleton;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午5:15
 */
public class Singleton1 {

    //在自己内部定义自己的一个实例，只供内部调用
    private static Singleton1 ourInstance = new Singleton1();

    public static Singleton1 getInstance() {
        return ourInstance;
    }


    private Singleton1() {
    }
}
