package cn.liuyiyou.dp.structural.adapter.demo3;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:06
 */
public class Test {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        apple1.getAColor("green");

        Orange orange = new Orange();
        AppleAdapter appleAdapter = new AppleAdapter(orange);

        //注意，现在桔子也是调用的apple的接口了。
        appleAdapter.getAColor("red");
        System.out.println();
    }
}
