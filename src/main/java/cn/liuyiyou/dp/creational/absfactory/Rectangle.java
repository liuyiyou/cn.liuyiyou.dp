/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Rectangle.java 
 * Package Name:cn.liuyiyou.dp.factory 
 * Date:2017年7月25日下午1:58:18 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: Rectangle <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
