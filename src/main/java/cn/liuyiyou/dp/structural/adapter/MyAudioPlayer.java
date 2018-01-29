/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:MyAudioPlayer.java 
 * Package Name:cn.liuyiyou.dp.structural.adapter 
 * Date:2017年7月25日下午2:22:08 
 * Copyright (c) 2017, liuyiyou.cn All Rights Reserved.
 * 
 */ 
package cn.liuyiyou.dp.structural.adapter;

/** 
 * 名称: MyAudioPlayer <br/> 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class MyAudioPlayer implements AudioPlayer {
	   @Override
	   public void playAudio(String fileName) {
	      System.out.println("Playing. Name: "+ fileName);    
	   }
	}
