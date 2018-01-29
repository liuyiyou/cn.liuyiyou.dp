/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:Main.java 
 * Package Name:cn.liuyiyou.dp.structural.adapter 
 * Date:2017年7月25日下午2:23:00 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */
package cn.liuyiyou.dp.structural.adapter;

/**
 * 名称: Main <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class Main {
	public static void main(String[] args) {
		MyPlayer myPlayer = new MyPlayer();

		myPlayer.play("mp3", "h.mp3");
		myPlayer.play("avi", "me.avi");
	}
}
