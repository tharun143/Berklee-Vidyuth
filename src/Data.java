package berklee;

public class Data {

	public String name ;
	
	public String rollno;
	
	public String pin;
	
	public String rack;
	
	public String date;
	
	public String website;
	
    public static String damage;
	
	public static String orderId;
	
	Data(String pin,String rack,String orderId, String name, String rollno,String date,String website,String damage){
		this.orderId= orderId;
		this.rack = rack;
		this.pin = pin;
		this.name   = name ;
		this.damage = damage;
		this.rollno = rollno;
		this.date   = date;
		this.website= website;
	}
}
