package cn.liuyiyou.dp.behavioral.visitor.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:16
 */
public class File extends Entry {

    private String name;

    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    String getName() {
        return name;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getSize() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
