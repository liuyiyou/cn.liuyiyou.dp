/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Main.java 
 * Package Name:cn.liuyiyou.dp.singleton 
 * Date:2017年7月25日下午2:09:49 
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
public class MainWindow {
	Menu menu;
	ToolBar toolBar;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public ToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(ToolBar toolBar) {
		this.toolBar = toolBar;
	}
}
