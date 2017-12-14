/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:MainWindow.java 
 * Package Name:cn.liuyiyou.dp.singleton 
 * Date:2017年7月25日下午2:08:36 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.singleton;

/**
 * 名称: MainWindow <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class MainWindow {
	private static MainWindow instance = new MainWindow();

	// make the constructor private so that this class cannot be
	// instantiated by other class
	private MainWindow() {
	}

	// Get the only object available
	public static MainWindow getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
