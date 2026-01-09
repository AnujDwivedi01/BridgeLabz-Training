package com.artify;

public class DigitalArt extends ArtWork implements IPurchasable{
	
	 // private variable
	 private String resolution;
     
	 
	 //without preview
	 public DigitalArt(String resolution) {
		super();
		this.resolution = resolution;
	 }
	 
	 //with preview
	 public DigitalArt(String resolution,String title, String artist, double price, String licenseType) {
		super(title,artist,price,licenseType);
		this.resolution = resolution;
	 }
	 
	 //purchase method
	 @Override
	 public void purchase(User user) {
		    if(user.getWalletBalance() >= getPrice()) {
		    	user.deductBalance(getPrice());
		    	System.out.println("Digital Art purchased Succesfully");
		    }
		    else {
	            System.out.println("Insufficient wallet balance");
	        }
	 }
	 
	 // license method
	   @Override
	    public void license() {
	        System.out.println("Digital Art License Type: " + licenseType);
	        System.out.println("Usage allowed for personal & commercial use");
	    }
	 
	 
	 
	 

} 
