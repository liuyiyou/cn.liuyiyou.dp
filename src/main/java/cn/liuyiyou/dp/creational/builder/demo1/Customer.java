package cn.liuyiyou.dp.creational.builder.demo1;

/**
 * 客户
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:53
 */
public class Customer {

    public static void main(String[] args){
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();


        Starbucks drink = waiter.getStarbucksDrink();
        drink.getDrink();
        drink.getSize();
    }
}
