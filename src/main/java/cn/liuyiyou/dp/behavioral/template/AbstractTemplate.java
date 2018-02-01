package cn.liuyiyou.dp.behavioral.template;

/**
 * User: liuyiyou
 * Date: 14-9-9
 * Time: 下午9:38
 * desc: 抽象模板角色类，基本方法是顶级逻辑组成步骤，这个顶级逻辑由templateMethod方法代表
 */
public  abstract class AbstractTemplate {

    /**
     * 模板方法
     * */
    public void templateMethod(){

        abstractMethod();

        hookMethod();

        concreteMethod();

    }

    /**
     * 基本方法，由子类实现
     * */
    protected abstract void abstractMethod();

    protected void hookMethod(){

    }

    private final void concreteMethod(){

    }
}
