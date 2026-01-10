package com.browserbuddy;
import java.util.Stack;
public class Browser {
        private Tab activeTab = new Tab();
        
        private Stack<Tab> closedTab = new Stack<>();
        
        
        // open a new tab
        public void openTab() {
        	activeTab = new Tab();
        	System.out.println("New Tab Opened");
        }
        
        //closing tab 
        public void closeTab() {
        	closedTab.push(activeTab);
        	activeTab = new Tab();
        	System.out.println("Tab Closed");
        }
        
        //restore last close tab
        public void restoreTab() {
        	if(!closedTab.isEmpty()) {
        		activeTab = closedTab.pop();
        		System.out.println("Tab Restored & current page is : " + activeTab.getCurrentPage());
        	}
        	else {
        		System.out.println("No Closed tabs to restore");
        	}
        }
        
        public Tab getActiveTab() {
            return activeTab;
        }
        
        
        
}
