import java.util.*;

class Car{
	private boolean engine;
	private String name;
	private int cylenders;
	private int wheels;

	public Car(String name, boolean engine, int cylenders, int wheels){
		this.name=name;
		this.engine=engine;
		this.cylenders=cylenders;
		this.wheels=wheels;
	}
	public Car(String name, int cylenders){
		this(name,true,cylenders,4);
	}

	public String getName(){ return name;}
	public boolean getEngine(){ return engine;}
	public int getWheels(){return wheels;}
	public int getCylenders(){return cylenders;}

	public void startEngine(){
		System.out.println("Car->"+ name + " engine started");
	}
	public void accelerate(){
		System.out.println("Car->"+ name + " is being accelerated");	
	}
	public void brake(){
		System.out.println("Brakes are applied on " + "Car->"+ name );	
	}
}

class Maruti extends Car{
	private String color;
	private boolean stereo;
	public Maruti(String color, boolean stereo){
		super("Maruti",2);
		this.color=color;
		this.stereo=stereo;
	}

	public void startEngine(){
		System.out.println("Car->"+ super.getName() + " engine started with a bang");
	}
	public void accelerate(){
		System.out.println("Car->"+ super.getName() + " is being accelerated, too fast!!!");	
	}
	public void brake(){
		System.out.println("Squeky types Brakes are applied on " + "Car->"+ super.getName() );	
	}

}

class Hyundai extends Car{
	private String color;
	private boolean stereo;
	public Hyundai(String color, boolean stereo){
		super("Hyundai",4);
		this.color=color;
		this.stereo=stereo;
	}

	public void startEngine(){
		System.out.println("Car->"+ super.getName() + " engine started with a Whoosh!!!!!!");
	}
	public void accelerate(){
		System.out.println("Car->"+ super.getName() + " is being accelerated, too very Slowly :-(");	
	}
	public void brake(){
		System.out.println("Disk brakes which are loose are applied on " + "Car->"+ super.getName() );	
	}

}

class Toyota extends Car{
	private String color;
	private boolean stereo;
	public Toyota(String color, boolean stereo){
		super("Toyota",4);
		this.color=color;
		this.stereo=stereo;
	}
}


public class Challenge{
	public static void main(String[] args) {

		for(int i=0;i<5;i++){
			Car curr= runCars();
			System.out.println("For "+(i+1)+"th Car:");
			curr.startEngine();
			curr.accelerate();
			curr.brake();
			System.out.println("**************************************************************");
			
		}
		
	}

	public static Car runCars(){
		switch( (int)( (Math.random()*3) +1) ){
			case 1: 
			return new Maruti("Black",true);
			case 2: 
			return new Hyundai("Space Grey", false);
			case 3: 
			return new Toyota("Deep Blue", true);
		}
		return null;
	}


}