# 分类

■ 设计模式主要有23种，可以将这些模式划分为三大类型：创建型、结构型和行为型；

■ 创建型包括：单例模式、工厂方法模式、抽象工厂模式、建造者模式和原型模式；

■ 结构型包括：代理模式、装饰模式、适配器模式、组合模式、桥梁模式、外观模式和享元模式；

■ 行为型包括：模板方法模式、命令模式、责任链模式、策略模式、迭代器模式、中介者模式、观察者模式、备忘录模式、访问者模式、状态模式和解释器模式。

# 在Spring中使用设计模式

因为在实际工作中，大都是Spring作为管理容器，而设计模式有些地方需要和容器打交道，所以，打算将常用设计模式和Spring联系起来

- 策略模式

以发起支付为例，现在有微信、支付宝、银联三种支付方式，每种支付方式的处理内容都不同

- 工厂模式

可以看到@Autowired注解在PaySerivce上的时候，是会报错的，因为一个接口有多种实现

- 模板模式

以发起支付为例。虽然三种支付方式每种都不同，但是有一些共性或者与支付无关的流程不需要在其他地方处理



