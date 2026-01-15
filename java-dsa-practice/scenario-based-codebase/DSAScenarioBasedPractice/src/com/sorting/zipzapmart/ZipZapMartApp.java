package com.sorting.zipzapmart;

public class ZipZapMartApp {
         public static void main(String[] args) {
        	 SaleTransaction[] sales = { 
        			 new SaleTransaction("2025-01-10",500),
        			 new SaleTransaction("2024-01-10",1200),
        			 new SaleTransaction("2025-02-10",800),
        			 new SaleTransaction("2025-01-11",100),
        			 new SaleTransaction("2025-01-23",600),
        			 new SaleTransaction("2025-01-18",900)
        	 };
        	 
        	 System.out.println("Before Sorting : ---");
        	 ZipZapMart.display(sales);
        	 
        	 
        	 ZipZapMart.mergeSort(sales, 0, sales.length-1);
        	 System.out.println("\nAfter Sorting : ---");
        	 
        	 ZipZapMart.display(sales);
        	 
         }
}
