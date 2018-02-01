package cn.liuyiyou.dp.structural.decorator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午3:54
 */
public abstract class Display {

    //
    abstract int getColumns();

    abstract int getRows();

    abstract String getRowText(int  row);

    public final void show(){
        for (int i=0;i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }
}
