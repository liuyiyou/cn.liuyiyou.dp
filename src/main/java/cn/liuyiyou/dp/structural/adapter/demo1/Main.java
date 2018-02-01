package cn.liuyiyou.dp.structural.adapter.demo1;


/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 上午10:58
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        Print p =new PrintBanner("Hello");
        p.printString();
        p.printWeak();



    }
}
