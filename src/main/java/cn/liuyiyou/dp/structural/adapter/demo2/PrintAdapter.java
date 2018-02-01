package cn.liuyiyou.dp.structural.adapter.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public class PrintAdapter  implements Provider {

     private    NeedAdapter needAdapter = new NeedAdapter() ;


    @Override
    public void print() {
        needAdapter.needAdatper();

    }
}
