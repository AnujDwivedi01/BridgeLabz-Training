package com.browserbuddy;

public class BrowserBuddyApp {
         public static void main(String[] args) {
        	 Browser browser = new Browser();
        	 
        	 browser.getActiveTab().visit("google.com");
        	 browser.getActiveTab().visit("github.com");
        	 browser.getActiveTab().visit("anuj.com");
        	 
        	 browser.getActiveTab().back();
        	 browser.getActiveTab().back();
        	 browser.getActiveTab().forward();
        	 
        	 
        	 browser.closeTab();
        	 browser.restoreTab();
        	 
        	 browser.getActiveTab().forward();
        	 
         }
}
