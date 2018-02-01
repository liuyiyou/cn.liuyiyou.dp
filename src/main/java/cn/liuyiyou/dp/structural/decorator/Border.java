package cn.liuyiyou.dp.structural.decorator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午3:59
 */
public class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }

    @Override
    int getColumns() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getRows() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    String getRowText(int row) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
