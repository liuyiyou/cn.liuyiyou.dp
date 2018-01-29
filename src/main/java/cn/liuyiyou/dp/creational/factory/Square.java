/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Square.java 
 * Package Name:cn.liuyiyou.dp.factory 
 * Date:2017年7月25日下午2:00:38 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.creational.factory;

/**
 * 名称: Square <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}