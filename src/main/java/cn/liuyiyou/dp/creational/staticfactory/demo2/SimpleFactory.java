package cn.liuyiyou.dp.creational.staticfactory.demo2;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午5:30
 */
public class SimpleFactory {

    public static Product createProduct(String str){
        if (str.equals("a")){
            return new ProductA();
        } else if (str.equals("b")){
            return new ProductB();
        }
        return  null;
    }
}
