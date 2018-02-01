package cn.liuyiyou.dp.structural.adapter.demo2;


/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        Provider provider = new PrintAdapter();
        provider.print();

    }


}
