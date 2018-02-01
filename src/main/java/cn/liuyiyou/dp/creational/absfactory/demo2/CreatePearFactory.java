package cn.liuyiyou.dp.creational.absfactory.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午5:36
 * To change this template use File | Settings | File Templates.
 */
public class CreatePearFactory implements AbstractFactory {

    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}
