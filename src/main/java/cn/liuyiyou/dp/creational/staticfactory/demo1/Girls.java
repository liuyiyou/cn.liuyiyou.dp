package cn.liuyiyou.dp.creational.staticfactory.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午4:48
 */
public class Girls implements Human {
    @Override
    public void talk() {
        System.out.println("Girl is talking");

    }

    @Override
    public void walk() {
        System.out.println("Girl is walk");
    }
}
