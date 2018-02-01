package cn.liuyiyou.dp.creational.absfactory.demo1;

/**
 * 具体产品，实现抽象产品方法
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:20
 */
public class InterCPU implements CPU {
    @Override
    public void process() {
        System.out.println("Inter CPU");
    }
}
