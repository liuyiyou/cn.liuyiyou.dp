package cn.liuyiyou.dp.structural.adapter.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 上午10:50
 * To change this template use File | Settings | File Templates.
 */
public class Banner {

    private String  string  ;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParent(){
        System.out.println("("+ string+")");
    }


    public void showWithAster(){
        System.out.println("*"+ string+"*");
    }


}
