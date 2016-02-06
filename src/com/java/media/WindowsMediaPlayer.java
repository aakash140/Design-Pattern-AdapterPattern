package com.java.media;

public class WindowsMediaPlayer implements MediaPlayer{
	public void play(String mediaFile,String format){
		if(format.equals("mp3")||format.equals("mpeg-2"))
			System.out.println("Playing :"+ mediaFile);
		else{
			MediaAdapter mediaAdapter=new MediaAdapter();
			mediaAdapter.play(mediaFile, format);
		}
	}
}