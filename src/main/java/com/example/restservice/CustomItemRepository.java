package com.example.restservice;

public interface CustomItemRepository {

    void updateItemQuantity(String itemName, float newQuantity);

}