package ru.spec.java1.dz;

public class DomZadanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b;
    a = 4;
    b = 5;
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("НОД("+a+","+b+")="+nod(a, b));
    System.out.println("НОК("+a+","+b+")="+nok(a, b));
    System.out.println("Число а простое -"+prost(a));
    System.out.println("Число b простое -"+prost(b));
	}

	private static int nod(int a, int b) {
		a = mod(a);
		b = mod(b);
		if (b==0) {return a;}
		else return nod(b,a%b);
	}
   
	private static int mod(int a) {
		if (a<0)a=a*-1;
		return a;
	}
	
	private static int nok(int a, int b) {
		a = mod(a);
		b = mod(b);
		return (a*b)/nod(a,b);
		}
	
	private static boolean prost(int a) {
		int i =2;
		for (;a%i!=0;++i) {}
		return i==a;
		
		} 
}
