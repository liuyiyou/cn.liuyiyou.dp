/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:WindowBuilder.java 
 * Package Name:cn.liuyiyou.dp.creational 
 * Date:2017年7月25日下午2:14:33 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.creational.builder;

import cn.liuyiyou.dp.creational.builder.MainWindow;
import cn.liuyiyou.dp.creational.builder.Menu;
import cn.liuyiyou.dp.creational.builder.ToolBar;

/**
 * 名称: WindowBuilder <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class WindowBuilder {
	public static MainWindow createWindow() {
		MainWindow window = new MainWindow();
		Menu menu = new Menu();
		ToolBar toolBar = new ToolBar();
		window.setMenu(menu);
		window.setToolBar(toolBar);
		return window;
	}
}
