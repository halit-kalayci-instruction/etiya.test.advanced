package com.etiya.method;

public class Main {
  public static void main(String[] args) {
    printStatus(1);
    printStatus(2);
    printStatus(3);
    printStatus(100);
    printStatus(50);


    int toplam = sum(5,10);

    System.out.println(toplam);
  }
  // printStatus isminde bir metot
  public static void printStatus(int status)
  {
    switch (status)
    {
      case 0:
        System.out.println("Sipariş alındı.");
        break;
      case 1:
        System.out.println("Ödeme tamamlandı.");
        break;
      case 2:
        System.out.println("Kargoya verildi.");
        break;
      case 3:
        System.out.println("Sipariş teslim edildi.");
        break;
      default:
        System.out.println("Geçersiz status.");
    }
  }
  public static int sum(int a, int b)
  {
    return a+b;
  }
}