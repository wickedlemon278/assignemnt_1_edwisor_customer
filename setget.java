package customer_details;



/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :setget
 *Function  :following class is used to define various methods for the program to set and get the details of the customer inputed by user ,also providing encapsulation & display use of abstraction in java 
 *Inheriting:inherits 'customer' class
 */


public abstract class setget extends customer{
	
	public abstract void setCustomerName(String givenName);
	
	public abstract void setCustomerID(String givenID);
	
	public abstract void setCustomerState(String givenState);
	
	public abstract void setCustomerSex(String givensex);
	
	public abstract void setCustomerContactNo(long givenNO);
	
	public abstract void setCustomerBill(double givenBill);
	
	public abstract void setCustomerCredit(double givenCredit);
	
	public abstract String getCustomerName();
	
	public abstract String getCustomerID();
	
	public abstract String getCustomerState();
	
	public abstract String getCustomersex ();

	public abstract long getCustomerContactNo();

	public abstract double getCustomerBill();
	
	public abstract double getCustomerCredit();
	
	
}
