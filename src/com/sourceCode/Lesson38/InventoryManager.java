package com.sourceCode.Lesson38;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductsList = new CopyOnWriteArrayList<Product>(); //these are not thread safe in itself
    List<Product> purchaseProductsList = new ArrayList<Product>();

    public void populateSoldProducts(){
        for(int i = 0 ; i <1000 ; i++){
            Product prod = new Product(i,"Product_Name_Id " + i);
            soldProductsList.add(prod);
            System.out.println("Added " + prod );

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void displaySoldProduct(){
        for(Product product:soldProductsList){
            System.out.println("sold product is: " + product );
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
