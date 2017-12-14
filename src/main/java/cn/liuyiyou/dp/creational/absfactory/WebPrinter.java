/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:WebPrinter.java 
 * Package Name:cn.liuyiyou.dp.absfactory 
 * Date:2017年7月25日下午2:04:54 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: WebPrinter <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class WebPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("web");
	}
}