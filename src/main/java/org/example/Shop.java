package org.example;

import inventaray.Inventary;

public class Shop {
    Inventary[] inventaries;

    public Shop(){

    }

    public Inventary getProduct(int i){
        if(inventaries[i] != null) {
            return inventaries[i];
        }
        throw new RuntimeException("Нет такого товара");
    }

    public void printProduct(){
        for (Inventary inventary : inventaries) {
            System.out.println(inventary.toString());

        }
    }
}
