import java.util.*;
import java.io.*;

class Exception101{
	public static void main(String args[]){
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String st= br.readLine();
			int i= Integer.valueOf(st);
			if(i==1){
				System.out.println(i/0);
			}else{
				FileInputStream fin= new FileInputStream("ABC.txt");
			}
		}catch(IOException ioE){
				System.out.println("IO Exception Caught :" +ioE);
		}catch(ArithmeticException arE){
			System.out.println("Arithimatic Exception Caught :" +arE);
		}finally{
			System.out.println("Entered Finnaly block");
		}
	}
}