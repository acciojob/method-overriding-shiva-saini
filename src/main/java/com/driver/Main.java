package com.driver;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(){
      B obj = new B();
      obj.meth();
      B obj1 = new B();
      obj1.meth();
  }
}