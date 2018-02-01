package cn.liuyiyou.dp.structural.decorator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午3:57
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    int getColumns() {
        return string.getBytes().length;
    }

    @Override
    int getRows() {
        return 1;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    String getRowText(int row) {
        if (row==0){
            return string;
        }else {
            return null;
        }
    }
}
