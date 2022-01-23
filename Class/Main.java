import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args){
		Car maruti= new Car();
		Car holdem= new Car();
		//Accessing the state variables
		maruti.setModel("WagonR");
		System.out.println("Details of Car 1:");
		maruti.printDataOfCar();
		System.out.println("Details of Car 2:");
		holdem.setModel("panni");
		holdem.printDataOfCar();

	}

	static class Car{
		private int doors;
		private int wheels;
		public  String model;
		private String colour;
		private char engine;

		public void setModel(String modelName){
			String checkvalid= modelName.toLowerCase();
			//Validating the input information
			if(checkvalid.equals("wagonr") || checkvalid.equals("holdem")){
				this.model=modelName;
			}else{
				System.out.println("Invalid Model");
			}
			
		}
		public void printDataOfCar(){
			System.out.print("Doors : " + this.doors);
			System.out.println(" || Wheels : " + this.wheels);
			System.out.print("Model : "+ this.model);
			System.out.println(" || Colour : " + this.colour);
			System.out.print("Engine is : " + this.engine);
			System.out.println(" || Car is Printed");
		}

	}
}

