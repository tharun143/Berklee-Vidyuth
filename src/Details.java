package berklee;

import java.util.ArrayList;

public class Details {

	static ArrayList<Data> ar = new ArrayList<Data>();
	
    private static String name ;
	
	private static String rollno;
	
	private static String date;
	
	private static String pin;
	
	private static String rack;
	
	private static String website;
	
	private static String damage;
	
	private static String orderId;
	
	Details(){
		
	}
	
	Details(String pin,String rack,String orderId, String name, String rollno,String date,String website,String damage){
		this.orderId= orderId;
		this.rack   = rack;
		this.name   = name ;
		this.rollno = rollno;
		this.date   = date;
		this.website= website;
		this.orderId= orderId;
		this.damage = damage;
		System.out.println(name+" "+pin);
	}
	
	public static void main(String[] args) {
		System.out.println(name+" "+pin);
		ar.add(new Data(pin,rack,orderId,name,rollno,date,website,damage));
		System.out.println(ar.get(ar.size()).rack);
	}
}
