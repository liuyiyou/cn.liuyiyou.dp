package cn.liuyiyou.dp.creational.absfactory.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:22
 */
public class Client {

    public static void main(String[] args) {
        new Computer(createSpecificFactory());
        System.out.println();
    }

    public static CPUFactory createSpecificFactory(){
        int  sys=0;
        if (sys==0){
            return  new AMDFactory();
        }else {
            return new InterFactory();
        }
    }
}
