package cn.liuyiyou.dp.creational.absfactory.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args){
        AbstractFactory factory = new CreateAppleFacotry();
        factory.createFruit();


        AbstractFactory factory2 = new CreatePearFactory();
        factory2.createFruit();
    }
}
