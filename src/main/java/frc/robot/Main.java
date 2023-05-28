// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */

// Class 類別，Java程式的基本單位，基本上99.99%的程式碼都必須寫在Class裡面。
public final class Main {

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {

    // 基本型別 (Primitive Type)
    // 整數
    byte bytea;
    short shorta;
    int inta;
    long longa;

    // 小數
    float floata;
    double doublea = 4.73;

    // 布林值
    boolean booooo;

    // 字元
    char chara = 'a';

    // 類別型別 (Class Type)
    // 以下舉例的是Java為了使用者方便，而寫在原生Library(JDK)中的類別，
    // 他們也被視為是基本型別變數的類別型態(像int vs Integer，基本上就是改大小寫而已)，
    // 因此也被稱為Primitive Class。
    // 整數
    Byte byteea;
    Short shortta;
    Integer intta;
    Long longga;

    // 小數
    Float floatta;
    Double doubleea;

    // 布林值
    Boolean booleanna;

    // 字元
    Character charra;

    // 字串
    // 這個要特別記一下，不過我還是不理解這種常用的東西，為什麼不要直接做成常態變數
    // 可能是因為執行速度的問題吧.....改天上網Google看看
    String stringa = "aa";

    // FRC常用（甚至是只會用）
    // 常態變數
    //  int 整數
    //  double 小數
    //  boolean 布林值(true / false)
    // 類別型態
    //  Integer 整數
    //  Double 小數
    //  Boolean 布林值
    //  String 字串

    // 宣告式
    // 宣告變數 -> <變數類別> <變數名稱>
    // 初始化變數 -> <變數類別> <變數名稱> = <定義值>
    // 例：
    // 初始化常態變數 
    int a = 1;
    // 初始化類別變數
    Student student = new Student("idk", 3, 150, 40);
    // new運算子 + <類別名稱> -> 向系統請求記憶體空間，建立一個該Class的實例(instance)，也就是物件(object)，
    // 並呼叫該Class的建構子(Constructor)

    // Class的實例 (instance) == 物件 (object) == 一種類別變數 (Class type variable)
    // Class Type Variable 並不等於 Class Variable，前者是類別型別的變數，後者則為靜態變數(Staticc Variable)的別稱，
    // 這東西在之後的課程會提到。

    student.getName();
    student.setName("Albert");
    student.getName();
    
    // = -> 定義 equals
    // == -> 比較 equals to

    // 判斷式 (Statement)
    // 1. if else
    // boolean 布林值
    boolean aaa = true;
    int aaaaaaaaa = 1;

    if (aaa == true) {
      System.out.println("aaaaaaaa");
    } else {
      System.out.println("bbbbbbbbb");
    }
    // 也可以寫成
    if (aaa) {
      System.out.println("aaaaaaaa");
    } else {
      System.out.println("bbbbbbbbb");
    }
    // else 就是 如果發生!aaa，也就是非aaa的情況

    // else if
    String weather = "windy";

    if (weather == "rainy") {
      System.out.println("remember to bring ur umbrella.");
    } else if (weather == "sunny") {
      System.out.println("打球囉");
    } else if (weather == "windy") {
      System.out.println("好難過");
    } else if (weather == "typhoon") {
      System.out.println("泛舟囉");
    } else {
      System.out.println("aaaaaaaaa");
    }

    // 如果你要執行的內容只有一行，那你也可以這樣寫
    if (aaa) System.out.println("aaaaaa");

    // 但這種不加大括號的寫法，只會執行"第一行"
    if (aaa) 
      System.out.println("aaaaaa");
      System.out.println("bbbbbb");
      // "bbbbbb"不會被印出

    // 2. Switch case
    int aaaaa = 1;

    switch (aaaaa) {
      case 1: {
        System.out.println("yes");
      }
      case 2: {
        System.out.println("no");
      }
      case 3: {
        System.out.println("?????");
      }
    }

    // 也可以寫成
    if (aaaaa == 1) {
      System.out.println("yes");
    } else if (aaaaa == 2) {
      System.out.println("no");
    } else if (aaaaa == 3){
      System.out.println("?????");
    }



  }
}
