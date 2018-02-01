package cn.liuyiyou.dp.behavioral.visitor.demo1;


/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:14
 */
public abstract class Visitor {

    abstract void visit(File file);

    abstract void visit(Directory directory);
}
