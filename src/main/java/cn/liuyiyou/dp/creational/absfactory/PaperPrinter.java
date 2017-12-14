/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:PaperPrinter.java 
 * Package Name:cn.liuyiyou.dp.absfactory 
 * Date:2017年7月25日下午2:04:30 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.absfactory;

/**
 * 名称: PaperPrinter <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class PaperPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("paper");
	}
}
