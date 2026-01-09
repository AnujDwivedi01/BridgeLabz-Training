package com.artify;

public  class ArtWork {
         protected String title;
         protected String artist;
         private double price;
         protected String licenseType;
         
        
         
         // constructor without preview
		 public ArtWork() {
			
			this.title = "Sketch";
			this.artist = "Anuj Dwivedi";
			this.price = 5000.00;
			this.licenseType = "Annual";
		 }
         

         // constructor with preview
		 public ArtWork(String title, String artist, double price, String licenseType) {
			this.title = title;
			this.artist = artist;
			this.price = price;
			this.licenseType = licenseType;
		 }

         // returning price
		 public double getPrice() {
			 return price;
		 }
		 
		 
		 
         
        
         
         
         
}
