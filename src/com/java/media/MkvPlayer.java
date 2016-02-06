package com.java.media;

public class MkvPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String mediaFile) {
	}

	@Override
	public void playMkv(String mediaFile) {
		System.out.println("Playing "+ mediaFile);
	}
}