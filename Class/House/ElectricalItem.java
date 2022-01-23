import java.util.*;
public class ElectricalItem{
	private String name;
	private int wattage;
	private boolean state;
	private String work;

	public ElectricalItem(String name,String work,int wattage, boolean state){

		this.name=name;
		this.work=work;
		this.wattage=wattage;
		this.state=state;
	}

	public ElectricalItem(String name,String work,int wattage){

		this(name,work,wattage,false);
	}

	public String getName(){
		return name;
	}
	public int getWattage(){
		return wattage;
	}
	public boolean getState(){
		return state;
	}
	public String getWork(){
		return work;
	}

	public void setState(boolean state){
		this.state=state;
	}

}
