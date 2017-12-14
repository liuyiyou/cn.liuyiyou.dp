/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:ScreenPrinter.java 
 * Package Name:cn.liuyiyou.dp.absfactory 
 * Date:2017年7月25日下午2:05:10 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: ScreenPrinter <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class ScreenPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("screen");
	}
}
