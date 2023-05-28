package frc.robot;

public class Student {

    String name;
    int age;
    double height;
    double weight;

    public Student(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        System.out.println("Class inited");
    }

    // 用更簡單的方法理解小括號的意義
    // 他就是 f(x) = ax + b 的 (x) -> 引數
    // public double y(double x) {
    //     double a = 0.1;
    //     double b = 0.1;
    //     return (a * x) + b;
    // }

    // 函數 Function
    // 但是Java的函數都是被包在Class裡面的，所以真正的定義應為方法(Method)
    // 不過你講哪一個大家都聽得懂，講的習慣就好了。

    // 宣告函數 -> <函數回傳變數類型> <函數名稱> (<輸入的數值>) {<函數內容>}
    // public 目前看不懂沒關係，下堂課會解釋
    // 有興趣的可以參考 https://openhome.cc/Gossip/JavaEssence/PackageAndModifier.html
    public void getName() {
        System.out.println(name);
    }

    public double getTemp() {
        double temp = 0.1;
        return temp;
    }

    public void setName(String NewName) {
        this.name = NewName;
    }
}

