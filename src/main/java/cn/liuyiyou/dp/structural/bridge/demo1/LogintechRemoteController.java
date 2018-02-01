package cn.liuyiyou.dp.structural.bridge.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午6:20
 */
public class LogintechRemoteController extends AbstractRemoteController {

    public LogintechRemoteController(TV tv) {
        super(tv);
    }

    public void setChannelKeyboader(int channel){
        setChannel(channel);
        System.out.println("Logintech use keyboard to set channel");
    }
}
