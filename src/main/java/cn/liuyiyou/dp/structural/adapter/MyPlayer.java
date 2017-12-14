/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:MyPlayer.java 
 * Package Name:cn.liuyiyou.dp.structural.adapter 
 * Date:2017年7月25日下午2:22:47 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.structural.adapter;

/**
 * 名称: MyPlayer <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class MyPlayer implements Player {

	AudioPlayer audioPlayer = new MyAudioPlayer();
	VideoPlayer videoPlayer = new MyVideoPlayer();

	public MyPlayer() {
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("avi")) {
			videoPlayer.playVideo(fileName);
		} else if (audioType.equalsIgnoreCase("mp3")) {
			audioPlayer.playAudio(fileName);
		}
	}
}
