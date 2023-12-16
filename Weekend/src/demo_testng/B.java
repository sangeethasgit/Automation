package demo_testng;

public class B {
public static void main(String[] args) {
	A a1=new A(20);
	System.out.println("Before setter()"+a1.geti());
	a1.seti(50);
	System.out.println("After setter()"+a1.geti());
	//a1.test();
}
}
