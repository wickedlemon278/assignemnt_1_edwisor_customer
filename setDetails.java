package customer_details;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :setDetails
 *Function  :following class is used to set various characteristic details of the customer & also display use of abstraction in java
 *Inheriting:inherits 'setget' class
 */


public class setDetails extends setget{
    
	public  void setCustomerName(String givenName){
   	customerName=givenName;
   }
	
	public void setCustomerID(String givenID){
		customerID=givenID;
	}
	
	public void setCustomerState(String givenState){
		customerState = givenState;
	}
	
	public void setCustomerSex(String givensex){
		customersex=givensex;
	}
	
   public void setCustomerContactNo(long givenNO){
   	customerContactNo=givenNO;
   }
	
	public void setCustomerBill(double givenBill){
		customerBill=givenBill;
	}
	
	public void setCustomerCredit(double givenCredit){
		customerCredit=givenCredit;
	}
	
	public String getCustomerName() { //empty method to implement abstract class 'setget'
		return null;
	}
	
	public String getCustomerID() {  //empty method to implement abstract class 'setget'
		return null;
	}
	
	public String getCustomerState() {  //empty method to implement abstract class 'setget'
		return null;
	}
	
	public String getCustomersex() {  //empty method to implement abstract class 'setget'
		return null;
	}

	public long getCustomerContactNo() {  //empty method to implement abstract class 'setget'
		return 0;
	}
	
	public double getCustomerBill() {   //empty method to implement abstract class 'setget' 
		return 0;
	}

	public double getCustomerCredit() {  //empty method to implement abstract class 'setget'
		return 0;
	}

}

