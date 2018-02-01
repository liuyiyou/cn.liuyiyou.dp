package cn.liuyiyou.dp.behavioral.visitor.demo1;

import java.util.Iterator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:17
 */
public abstract  class Entry  implements Acceptor{

    abstract  String getName();

    abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException{
        throw  new FileTreatmentException();
    }

    public String toString(){
        return getName()+"("+ getSize()+")";
    }
}
