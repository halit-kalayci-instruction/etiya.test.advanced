package com.etiya.oop;

public class Product
{
  String name; // Property - Özellik
  double price;
  int stock;

  void sell() {
    System.out.println("Ürün: " + name + " satılıyor..");
  }
}
