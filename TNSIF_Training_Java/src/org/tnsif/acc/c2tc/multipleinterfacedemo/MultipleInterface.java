package org.tnsif.acc.c2tc.multipleinterfacedemo;

class Smartphone implements Camera, MusicPlayer {
	@Override
	public void playMusic() {
		System.out.println("Play the music in the smarthphone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Take a photo in the smarthphone");
		
	}
}
public class MultipleInterface  {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		smartphone.takePhoto();
		smartphone.playMusic();

	}

	

}
