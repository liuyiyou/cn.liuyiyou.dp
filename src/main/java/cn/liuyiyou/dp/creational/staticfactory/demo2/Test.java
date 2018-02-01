package cn.liuyiyou.dp.creational.staticfactory.demo2;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午5:37
 */
public class Test {

    public static void main(String[] args) {
        SimpleFactory.createProduct("a").show();

        SimpleFactory.createProduct("b").show();  ;
        System.out.println();
    }
}
