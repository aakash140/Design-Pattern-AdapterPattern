package com.java.media;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String mediaFile) {
		System.out.println("Playing "+ mediaFile);
	}

	@Override
	public void playMkv(String mediaFile) {
	}
}