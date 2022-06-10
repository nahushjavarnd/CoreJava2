package com.app;
class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}

public class Typecasting {
	static float methodOne(int i)
    {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }
	
	static short methodOne(long l)
    {
        int i = (int) l;     //long is explicitly narrowed to int
        return (short)i;       //int is explicitly narrowed to short
    }
 
 
    public static void main(String[] args)
    {
        byte b = 10;
        short s = b;      //byte is auto widened to short
        double d = methodOne(s);    //short is auto widened to int and float to double
        System.out.println(d);
        
        double D = 10.25;
        float f = (float) D;      //double is explicitly narrowed to float
        byte B = (byte) methodOne((long) f);    //float is explicitly narrowed to long and short to byte
        System.out.println(B);
        
        
        D d1 = new D();
        C c = d1;       // D type object is Auto-Up Casted to C type
        B b1 = d1;      // D type object is Auto-Up Casted to B type
        C c1 = new C();
        A a = c1;    // C type object is Auto-Up Casted to A type
        A a1 = new B(); // B type object is Auto-Up Casted to A type
        
        
        
        A a11 = new A();
        B b11 = (B) a11;   //A type is explicitly downcasted to B type
        C c11 = (C) a11;   //A type is explicitly downcasted to C type
        D d11 = (D) a11;   //A type is explicitly downcasted to D type
        B b111 = new B();
        D d111 = (D) b111;  //B type is explicitly downcasted to D type
        d111 = (D) new C();  //C type is explicitly downcasted to D type
    }

}
