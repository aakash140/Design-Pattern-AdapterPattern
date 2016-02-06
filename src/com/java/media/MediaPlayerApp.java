package com.java.media;

public class MediaPlayerApp {
	public static void main(String[] args) {
		WindowsMediaPlayer mediaPlayer=new WindowsMediaPlayer();
		mediaPlayer.play("ABC", "Mp4");
	}
}