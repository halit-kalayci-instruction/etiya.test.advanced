package com.etiya.oop;

public class Product
{
  // yapıcı blok - constructor - ctor
  // Ctor tanımı yoksa, boş (parametresiz) ctor oto. oluşturulur.

  public Product() {

  }

  public Product(String name, double price, int stock) {
    // this = içinde bulundugum sınıfı temsil eder.
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  String name; // Property - Özellik
  double price;
  int stock;

  void sell() {
    System.out.println("Ürün: " + name + " satılıyor..");
  }
}
