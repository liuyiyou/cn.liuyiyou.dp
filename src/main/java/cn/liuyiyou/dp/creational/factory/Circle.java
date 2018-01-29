/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Circle.java 
 * Package Name:cn.liuyiyou.dp.factory 
 * Date:2017年7月25日下午2:00:02 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.creational.factory;

/**
 * 名称: Circle <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
