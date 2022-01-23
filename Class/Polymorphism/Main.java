
class Movie{
	private String name;

	public Movie(String name) {this.name=name;}

	public String plot(){
		return "No plot here";
	}
	public String getName(){
		return name;
	}
}

class Jaws extends Movie{
	public Jaws(){
		//we are initializing the the parent class using super
		super("Jaws");
	}

	/* for plot function we can either use overide anotation
	or we can not use it */
	public String plot(){
		return "A Shark eats lots of people";
	}
}

class IndependenceDay extends Movie{
	public IndependenceDay(){
		//we are initializing the the parent class using super
		super("IndependenceDay");
	}

	/* for plot function we can either use overide anotation
	or we can not use it */
	@Override
	public String plot(){
		return "Aliens Overtake our planet";
	}
}

class MazeRunner extends Movie{
	public MazeRunner(){
		//we are initializing the the parent class using super
		super("MazeRunner");
	}

	/* for plot function we can either use overide anotation
	or we can not use it */
	@Override
	public String plot(){
		return "kids try to escape a maze";
	}
}


class StarWars extends Movie{
	public StarWars(){
		//we are initializing the the parent class using super
		super("StarWars");
	}

	/* for plot function we can either use overide anotation
	or we can not use it */
	@Override
	public String plot(){
		return "Imperial forces try to overtake the world";
	}
}

class Forgotten extends Movie{
	public Forgotten(){
		//we are initializing the the parent class using super
		super("Forgotten");
	}
	//no plot method
}


// ////////////////    Main Function and class    //////////////////////////
public class Main{
	public static void main(String[] args) {


		for(int i=0;i<10;i++){
			Movie movie= randMovie();
			System.out.println("Movie #"+i+ " : "
								 +movie.getName()+ "\n" +
								 "Plot : "+ movie.plot()+ "\n");
		}
		
	}

	public static Movie randMovie(){
		int randNum= (int) (Math.random()*5)+1;

		switch(randNum){
			case 1:
			return new Jaws();
			case 2:
			return new IndependenceDay();
			case 3:
			return new MazeRunner();
			case 4:
			return new StarWars();
			case 5:
			return new Forgotten();
			
		}
		return null;
	}
}













