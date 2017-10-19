package ru.spec.java1.lec2;

import java.math.BigInteger;

public class EntryPoint {
	public static void main(String[] args) {

		BigInteger a = fib();
		
		System.out.println(Math.pow(2.5, -3.3332));
		
		
		//do {} while (true);
		int[] array = new int[10];
		int[] array1 = {1,2,3,4,5,6};
		for (int i : array1) {
			System.out.println(i);
		}
		
		
		
		
	}

	private static BigInteger fib() {
		BigInteger a=new BigInteger("1"), b=a, c;
		for (int i =1;i<=100;++i) {
			c=a.add(b);
			
			a=b;
			b=c;
		}
		
		System.out.println("()=" +a);
		return a;
	}
}