package customer_details;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :getDetails
 *Function  :following class is used to get various characteristic details of the employee and store  them in  various desired variables, display use of abstraction in java
 *Inheriting:inherits 'setget' class
 */
public class getDetails extends setget{

	public String getCustomerName(){
		return customerName;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	
	public  String getCustomerState(){
		return customerState;
	}
	
	public String getCustomersex (){
		return customersex;
	}
	
	public long getCustomerContactNo(){
		return customerContactNo;
	}

	public double getCustomerBill(){
		return customerBill;
	}
	
	public double getCustomerCredit(){
		return customerCredit;
	}
	
	public void setCustomerName(String givenName) {
		//empty method to implement abstract class 'setget'
	}

	public void setCustomerID(String givenID) {
		//empty method to implement abstract class 'setget'
	}

	public void setCustomerState(String givenState) {
		//empty method to implement abstract class 'setget'
	}
	
	public void setCustomerSex(String givensex) {
		//empty method to implement abstract class 'setget'
	}

	public void setCustomerContactNo(long givenNO) {
		//empty method to implement abstract class 'setget'
	}

	public void setCustomerBill(double givenBill) {
		//empty method to implement abstract class 'setget'
	}

	public void setCustomerCredit(double givenCredit) {
		//empty method to implement abstract class 'setget'
	}

}