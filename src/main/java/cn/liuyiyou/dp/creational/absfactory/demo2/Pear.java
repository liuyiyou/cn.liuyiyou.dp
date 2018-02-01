package cn.liuyiyou.dp.creational.absfactory.demo2;

/**
 * 具体的水果
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午5:31
 */
public class Pear implements Fruit {

    public Pear() {
        System.out.println("创建的是梨子");
    }

    public void show(){
        System.out.println("Pear show");
    }
}
