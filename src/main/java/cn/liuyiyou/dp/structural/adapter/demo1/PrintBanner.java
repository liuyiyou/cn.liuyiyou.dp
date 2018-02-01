package cn.liuyiyou.dp.structural.adapter.demo1;


/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-8-10
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
public  class PrintBanner extends Banner implements Print {

    //这个需要注意，没有这句话就会出问题，提示没有默认的构造函数
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParent();
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void printString() {
        showWithAster();
        //To change body of implemented methods use File | Settings | File Templates.
    }
}