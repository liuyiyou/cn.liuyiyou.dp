/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Main.java 
 * Package Name:cn.liuyiyou.dp.creational.builder 
 * Date:2017年7月25日下午2:14:59 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.creational.builder;

/**
 * 名称: Main <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Main {
	public static void main(String[] args) {
		MainWindow object = WindowBuilder.createWindow();
		object.getMenu();
	}
}
