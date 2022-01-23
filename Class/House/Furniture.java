import java.util.*;
public class Furniture{
	private String name;
	private String work;
	private String state;

	public Furniture(String name,String work,String state){

		this.name=name;
		this.work=work;
		this.state=state;
	}
	public Furniture(String name,String work){

		this(name,work,"sitting Idle");
	}

	public String getName(){
		return name;
	}
	public String getState(){
		return state;
	}
	public String getWork(){
		return work;
	}

}
