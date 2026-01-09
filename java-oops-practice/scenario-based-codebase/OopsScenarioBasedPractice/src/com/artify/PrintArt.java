package com.artify;

public class PrintArt extends ArtWork implements IPurchasable {
	// private variable
		 private String printSize;
	     
		 
		 //without preview
		 public PrintArt(String printSize) {
			super();
			this.printSize = printSize;
		 }
		 
		 //with preview
		 public PrintArt(String resolution,String title, String artist, double price, String licenseType) {
			super(title,artist,price,licenseType);
			this.printSize = printSize;
		 }
		 
		 //purchase method
		 @Override
		 public void purchase(User user) {
			    if(user.getWalletBalance() >= getPrice()) {
			    	user.deductBalance(getPrice());
			    	System.out.println("Printsd Art purchased Succesfully");
			    }
			    else {
		            System.out.println("Insufficient wallet balance");
		        }
		 }
		 
		 // license method
		   @Override
		    public void license() {
		        System.out.println("Printed Art License Type: " + licenseType);
		        System.out.println("Usage allowed for professional & commercial use");
		    }
		 
}
