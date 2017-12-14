/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:MyVideoPlayer.java 
 * Package Name:cn.liuyiyou.dp.structural.adapter 
 * Date:2017年7月25日下午2:22:30 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.structural.adapter;

/**
 * 名称: MyVideoPlayer <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class MyVideoPlayer implements VideoPlayer {
	@Override
	public void playVideo(String fileName) {
		System.out.println("Playing. Name: " + fileName);
	}
}
