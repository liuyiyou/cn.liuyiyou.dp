package cn.liuyiyou.dp.creational.builder.demo1;

/**
 * 抽象builder
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:46
 */
public abstract  class StarbucksBuilder {

    protected Starbucks starbucks;

    public Starbucks getStarbucks() {
        return starbucks;
    }


    public void createStarbucks(){
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();
}
