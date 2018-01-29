/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:AbstractFactory.java 
 * Package Name:cn.liuyiyou.dp.absfactory 
 * Date:2017年7月25日下午2:05:37 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: AbstractFactory <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public abstract class AbstractFactory {

	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}
