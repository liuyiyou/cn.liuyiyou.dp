package cn.liuyiyou.dp.creational.builder.demo1;

/**
 * 泡茶Builder
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:49
 */
public class TeaBuilder extends StarbucksBuilder{

    @Override
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("builder medium size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("builder tea");
    }
}
