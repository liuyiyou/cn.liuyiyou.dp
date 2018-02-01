package cn.liuyiyou.dp.structural.decorator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:07
 */
public class Main {

    public static void main(String[] args) {
        Display b1 =new StringDisplay("Hello ,world");
        Display b2 = new SideBorder(b1,'#') ;
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        System.out.println();
    }
}
