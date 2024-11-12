package com.etiya.oop;

public class Main {
  public static void main(String[] args)
  {

    String name = "Halit";

    // new X(); => X classından yeni bir "instance" oluşturur.
    Product product = new Product();
    product.stock = 50;
    product.price = 5000;
    product.name = "Laptop";
    product.sell();

    Product product1 = new Product();
    product1.stock = 10;
    product1.price = 2000;
    product1.name = "Mouse";
    product1.sell();

  }
}
