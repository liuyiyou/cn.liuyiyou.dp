package cn.liuyiyou.dp.creational.builder.demo1;

/**
 * 指导如何封装builder
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:51
 */
public class Waiter {
    private StarbucksBuilder starbucksBuilder;


    public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    public Starbucks getStarbucksDrink(){
      return   starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks(){
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }
}
