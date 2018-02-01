package cn.liuyiyou.dp.behavioral.visitor.demo1;

import java.util.Iterator;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:27
 */
public class ListVisitor extends Visitor {

    String currentDir = "";

    @Override
    public  void visit(File file) {
          System.out.println(currentDir+"/"+ file);
    }

    @Override
    void visit(Directory directory) {

        System.out.println(currentDir+"/"+ directory);
        String saveDir = currentDir;
        currentDir = currentDir +"/" +directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }

        currentDir = saveDir;

        //To change body of implemented methods use File | Settings | File Templates.
    }
}
