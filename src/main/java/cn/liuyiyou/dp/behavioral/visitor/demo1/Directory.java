package cn.liuyiyou.dp.behavioral.visitor.demo1;

import java.util.Iterator;
import java.util.Vector;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:16
 */
public class Directory extends Entry {

    private String name;
    private Vector dir = new Vector();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getSize() {
        int  size = 0;
        Iterator iterator = dir.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            size += entry.getSize();
        }
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public  Entry add(Entry entry) {
        dir.add(entry);
        return  this;
    }

    public  Iterator iterator(){
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
          visitor.visit(this);
    }
}
