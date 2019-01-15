package berklee;

import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 
class  deckAlloting 
{ 
	static String orderId;
	static int k;
	deckAlloting(int j,String l)
	{
		k = j ;
		orderId = l;
	}
	
	public static String orderId() {
	Map<Integer,String> locadd =  new HashMap<Integer,String>(); 
    AbstractQueue<Integer> AddressQ = new LinkedBlockingQueue<Integer>(); 
    //the address queue is created.
     for(int i=1;i<10;i++)
     {
         AddressQ.add(i);
     }
     //the addressqueue is printed..
      System.out.println("AbstractQueue contains: "+ AddressQ); 
     /* the productcode is assigned with an address from the queue of unassigned address 
     and removed from the queue */

    String productcode; 
    int location=0;
    productcode = orderId; 
    if(k == 1)
    {
	       location=new Integer(AddressQ.remove());
	       locadd.put(location,productcode ); 
	       return String.valueOf(location); 
    }
    /*the product code is unassigned with the corresponding address and the address is 
    put back into the queue*/ 
    else if(k == 2)
    {
	       String productcode_2 =locadd.remove(location);
	       System.out.println(productcode_2);    
	       AddressQ.add(location);  
	       //the addressqueue is printed..
	        return productcode_2; 
    }return " ";

		
	}
} 
