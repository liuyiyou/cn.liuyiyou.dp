package cn.liuyiyou.dp.structural.bridge.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午6:16
 */
public class SonyTV implements TV {
    @Override
    public void on() {
        System.out.println("SonyTV is truned on");
    }

    @Override
    public void off() {
        System.out.println("SonyTV is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("SonyTV channel-: " + channel);
    }
}
