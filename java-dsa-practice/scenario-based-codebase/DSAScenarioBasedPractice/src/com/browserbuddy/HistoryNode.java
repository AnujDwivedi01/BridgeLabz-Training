package com.browserbuddy;
class HistoryNode {
       String url;
       HistoryNode next;
       HistoryNode prev;
       
      public  HistoryNode(String url){
    	    this.url = url;
       }
}