/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Main.java 
 * Package Name:cn.liuyiyou.dp.singleton 
 * Date:2017年7月25日下午2:09:49 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.singleton;

/**
 * 名称: Main <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Main {
	public static void main(String[] args) {
		// Get the only object available
		MainWindow object = MainWindow.getInstance();

		// show the message
		object.showMessage();
	}
}
