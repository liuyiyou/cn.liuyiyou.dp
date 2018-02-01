package cn.liuyiyou.dp.creational.builder.demo1;

/**
 * 泡茶Builder
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:49
 */
public class CoffeeBuilder extends StarbucksBuilder{

    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("builder large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("builder coffee");
    }
}
