package cn.liuyiyou.dp.creational.singleton;

/**
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，
 * Singleton的唯一实例只能通过getInstance
 * ()方法访问。（事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效
 * 。此问题在此处不做讨论，姑且掩耳盗铃地认为反射机制不存在。）
 * 
 * 但是以上实现没有考虑线程安全问题。所谓线程安全是指：如果你的代码所在的进程中有多个线程在同时运行，而这些线程可能会同时运行这段代码。
 * 如果每次运行结果和单线程运行的结果是一样的，而且其他的变量的值也和预期的是一样的，就是线程安全的。或者说：
 * 一个类或者程序所提供的接口对于线程来说是原子操作或者多个线程之间的切换不会导致该接口的执行结果存在二义性
 * ,也就是说我们不用考虑同步的问题。显然以上实现并不满足线程安全的要求，在并发环境下很可能出现多个Singleton实例。
 * 
 */
public class Singleton4 {
	private static Singleton4 uniqueInstance = null;

	private Singleton4() {
		// Exists only to defeat instantiation.
	}

	public static Singleton4 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton4();
		}
		return uniqueInstance;
	}
	// Other methods...
}

//warning
