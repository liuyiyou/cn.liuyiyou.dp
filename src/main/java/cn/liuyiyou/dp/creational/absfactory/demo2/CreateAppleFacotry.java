package cn.liuyiyou.dp.creational.absfactory.demo2;

/**
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午5:35
 */
public class CreateAppleFacotry implements AbstractFactory {

    @Override
    public Fruit createFruit() {
        return  new Apple();
    }
}
