package cn.liuyiyou.dp.structural.bridge.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午6:18
 */
public abstract class AbstractRemoteController {

    private TV tv;

    protected AbstractRemoteController(TV tv) {
        this.tv = tv;
    }

    public void trunOn(){
        tv.on();
    }

    public void trunOff(){
        tv.off();
    }

    public void setChannel(int  channel){
        tv.switchChannel(channel);
    }
}
