package com.infinite;
/*class Table2 extends Thread {
	public void run()
	{
		printTable(10);
	}
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println("thread-1");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Table3 extends Thread {
	public void run()
	{
		printTable(5);
	}
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println("thread-2");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Table1 {
	public static void main(String args[])
	{
		Table2 obj1=new Table2(); 
		Table3 obj2=new Table3(); 
		//Table3 obj3=new Table3(); 
		obj1.start();
		obj2.start();
		//obj3.start();
	}
}*/
class Table1 {
	void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
 
	}
}
class MyThread11 extends Thread {
	Table1 t;
 
	MyThread11(Table1 t) {
		this.t = t;
	}
 
	public void run() {
		t.printTable(5);
	}
}
class MyThread22 extends Thread {
	Table1 t;
 
	MyThread22(Table1 t) {
		this.t = t;
	}
 
	public void run() {
		t.printTable(100);
	}
}
public class MyTable {
	public static void main(String args[])
	{
		Table1 obj1=new Table1();
		MyThread11 obj2=new MyThread11(obj1);
		MyThread22 obj3=new MyThread22(obj1);
		//Table3 obj3=new Table3(); 
		obj2.start();
		obj3.start();
		//obj3.start();
	}
}