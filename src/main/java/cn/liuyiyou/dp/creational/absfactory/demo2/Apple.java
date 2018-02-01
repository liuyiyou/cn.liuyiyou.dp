package cn.liuyiyou.dp.creational.absfactory.demo2;

/**
 * 具体的水果
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午5:30
 */
public class Apple implements Fruit {

    public Apple() {
        System.out.println("创建的是苹果");
    }

    public void show(){
        System.out.println("Apple Show");
    }
}
