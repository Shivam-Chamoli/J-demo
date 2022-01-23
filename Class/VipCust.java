public class VipCust{
	String name;
	String email;
	int creditLimit;

	public VipCust(){
		this("Customer","NA",10000);
	}
	public VipCust(String name, String email, int creditLimit){
		this.name=name;
		this.email=email;
		this.creditLimit=creditLimit;
	}

	public VipCust(String name,int creditLimit){
		this(name,"NA",creditLimit);
	}
	public VipCust(String name){
		this(name,"NA",10000);
	}
	public VipCust(String name, String email){
		this(name,email,10000);
	}
	
}