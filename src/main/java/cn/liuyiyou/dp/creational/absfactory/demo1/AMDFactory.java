package cn.liuyiyou.dp.creational.absfactory.demo1;

/**
 * 具体工厂，实现抽象工厂方法
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:19
 */
public class AMDFactory implements CPUFactory {

    @Override
    public CPU produceCPU() {
        return new AMDCPU();
    }
}
