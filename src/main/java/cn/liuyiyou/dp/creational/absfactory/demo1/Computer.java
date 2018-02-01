package cn.liuyiyou.dp.creational.absfactory.demo1;

/**
 * 组合类，在抽象工厂模式中不需要一定存在
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:21
 */
public class Computer {

    private  CPU cpu;

    public Computer(CPUFactory cpuFactory){
        cpu = cpuFactory.produceCPU();
        cpu.process();
    }
}
