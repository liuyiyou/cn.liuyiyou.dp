package cn.liuyiyou.dp.creational.singleton;

//饿汉式单例类.在类初始化时，已经自行实例化 
public class Singleton5 {
	// 私有的默认构造子
	private Singleton5() {
	}

	// 已经自行实例化
	private static final Singleton5 single = new Singleton5();

	// 静态工厂方法
	public static Singleton5 getInstance() {
		return single;
	}
}