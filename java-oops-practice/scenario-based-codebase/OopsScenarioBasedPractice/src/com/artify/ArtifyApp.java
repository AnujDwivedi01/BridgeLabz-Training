package com.artify;

public class ArtifyApp {
	 public static void main(String[] args) {
		 
		 // creating object for user class
		 User vishal = new User("Vishal Yadav" , 5000);
		 User anupam = new User("Anupam Shukla" , 7000);
		 
		 
		 DigitalArt digitalArt = new DigitalArt("300*450", "Digital Art", "Anuj Dwivedi ", 2000, "Annual");
		 digitalArt.purchase(vishal);
		 
		 digitalArt.license();
		 
		 
	 }

}
