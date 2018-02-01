package cn.liuyiyou.dp.structural.bridge.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午6:22
 */
public class User {

    public static void main(String[] args) {
        TV tv = new SonyTV();
        LogintechRemoteController lrc = new LogintechRemoteController(tv);
        lrc.setChannelKeyboader(100);
        System.out.println();
    }
}
