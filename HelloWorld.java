import java.util.*;
import java.io.*;
public class HelloWorld{
	public static void main(String[] args) throws IOException{
		System.out.println("Hello World");
		System.out.println("Enter Your First Number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("The Entered Number is : " + n);
		String s1="Meet Me";
		String s2= s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("After changing s1");
		s1=s1+" at the cofee shop";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Checking swap");
		swap(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
		String[] arr= {s1,s2};
		swap(arr);
		System.out.println("After using array");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}
	public static void swap(String s1, String s2){
		String temp=s1;
		s1=s2;
		s2=temp;
	}
	public static void swap(String[] s){
		String temp=s[0];
		s[0]=s[1];
		s[1]=temp;
	}
}


