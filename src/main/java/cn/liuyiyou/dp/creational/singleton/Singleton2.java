package cn.liuyiyou.dp.creational.singleton;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午5:17
 */
public class Singleton2 {

    private Singleton2 singleton2;

    private Singleton2(){

    }

    private Singleton2 getInstance(){
        if (singleton2 == null)
            singleton2 = new Singleton2();
        return singleton2;
    }
}
