package com.etiya.conditional;

public class Main
{
  public static void main(String[] args) {
    System.out.println("Conditional");

    // if - else if - else

    int age = 19;

    // Bir şart bloğu 1 ile n adet arasında şart içerebilir.
    if (age > 18)
    {
      System.out.println("Kullanıcı reşit.");
    }
    else if(age == 18)
    {
      System.out.println("Kullanıcı tam 18 yaşında, doğum ayı kontrol ediliyor..");
    }
    else {
      System.out.println("Kullanıcı reşit değil.");
    }
    // switch-case
    int status = 7;
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
}
