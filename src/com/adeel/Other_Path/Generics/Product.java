package com.adeel.Other_Path.Generics;

public class Product<T, U> {

    T item;
    U price;

    public Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }


    public void setPrice(U price){
        this.price = price;
    }
    public U getPrice(){
        return this.price;
    }


}
