/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:FactoryProducer.java 
 * Package Name:cn.liuyiyou.dp.absfactory 
 * Date:2017年7月25日下午2:07:04 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: FactoryProducer <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Printer")) {
			return new PrinterFactory();
		}
		return null;
	}
}
