package com.java.media;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	@Override
	public void play(String mediaFile, String format) {
		if(format.equals("Mp4")){
			advancedMediaPlayer=new Mp4Player();
			advancedMediaPlayer.playMp4(mediaFile);
		}	
		else if(format.equals("Mkv")){
			advancedMediaPlayer=new MkvPlayer();
			advancedMediaPlayer.playMkv(mediaFile);
		}
		else{
			System.out.println("Cannot play "+ format+" format");
		}
	}
}