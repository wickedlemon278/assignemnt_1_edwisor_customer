
package customer_details;

import java.util.Scanner;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :customer
 *Function  :main class containing main() method and provides the right flow to the program .
 */


public class customer {
// variables to store the various details of the customer
	public static String customerName;
	public static String customerID;
	public static String customerState;
	public static String customersex;
	public static long customerContactNo;
	public static double customerBill;
	public static double customerCredit;
	public static double customerBalance;
	
	public static String str1 = "s";  // reference variable to check the input the user
/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void intro(){   // introductory method intro() which also provides help for recursiveness in program 
		 System.out.println("**********************  Welcome To Customer Detail System *************************");
		 coreFunction();
	 }
/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	


	 public static void coreFunction(){     //  which controls the flow of program , also getting input and storing the deatils of the Customer & making decision based on the input 
		 System.out.println("Select the working mode:");
		 System.out.println("1) Press 's' (set)for setting details of the Customer \n2) Press 'e' (exit) to exit programm");
		 setDetails set = new setDetails() ;  // objects for setdetails and getdetails methods 
		 getDetails get = new getDetails();
			Scanner inputCommand  = new Scanner (System.in);  // object for input
			String input = inputCommand.nextLine();
			int compareResult = input.compareTo(str1);
			if (compareResult == 0){ //......................comparison of input to decide the desired mode of the user
				System.out.println(" INPUT COMMAND : 'S' ");
				System.out.println("Enterring SET Command Mode........... ");
				System.out.println("Enter the Name of the Customer :");
				String inputName = inputCommand.nextLine();
				set.setCustomerName(inputName);                  // getting input the details of the Customer
				System.out.println("Enter the Customer ID of the Customer :");
				String inputID = inputCommand.nextLine();
				set.setCustomerID(inputID);                     // getting input the details of the Customer
				System.out.println("Enter the State of the Customer");
				String inputState = inputCommand.nextLine();
				set.setCustomerState(inputState);	    // getting input the details of the Customer
				System.out.println("Enter the sex of the Customer");
				String inputSex = inputCommand.nextLine();
				set.setCustomerSex(inputSex);	       // getting input the details of the Customer
				System.out.println("Enter the contact no of the Customer");
				long inputContactNo = inputCommand.nextLong();
				set.setCustomerContactNo(inputContactNo);           // getting input the details of the Customer
				System.out.println("Enter the bill of the Customer");
				double inputBill = inputCommand.nextDouble();
				set.setCustomerBill(inputBill);	       // getting input the details of the Customer
				System.out.println("Enter the credit of the Customer");
				double inputCredit = inputCommand.nextDouble();
				set.setCustomerCredit(inputCredit);	       // getting input the details of the Customer
				String vacant= inputCommand.nextLine();       // a vacant input provide smooth operation !!! note: if removed the next input takes 'v' as default input giving bugged program .
				System.out.println("ALL SET  !!!! ");
				System.out.println("1) press 'S' (set)for setting details of the Customer \n2) press 'v'(view) to view details of the Customer");
				String inputCommand2 = inputCommand.nextLine();
				int compareResult_2 = inputCommand2.compareTo(str1);  // comparing the input of user to select the correct working mode
				if(compareResult_2 == 0){
					coreFunction();      // recursion 
				}
				else {
					System.out.println("NAME\t\t:"+get.getCustomerName());                      // getting the details stored using inheritance 
					System.out.println("ID\t\t:"+get.getCustomerID());							// getting the details stored using inheritance 
					System.out.println("STATE\t\t:"+get.getCustomerState());			// getting the details stored using inheritance 			
					System.out.println("SEX\t\t:"+get.getCustomersex());				// getting the details stored using inheritance 	
					System.out.println("CONTACTNO.      :"+get.getCustomerContactNo());					// getting the details stored using inheritance 
					System.out.println("BILL\t\t:"+get.getCustomerBill());				// getting the details stored using inheritance 	
					System.out.println("CREDIT\t\t:"+get.getCustomerCredit());				// getting the details stored using inheritance 	
					customerBalance=get.getCustomerCredit()-get.getCustomerBill();
					System.out.println("BALANCE\t\t:"+customerBalance);				// getting the details stored using inheritance 	
					intro();     // recursion 
					}
			}
			else {
				System.out.println("INPUT COMMAND : 'E' ");
				System.out.println("EXITING .....");
				
			} 
			 
	 }
	
/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
	public static void main(String[] args) {
		intro();
	}

}
/////////////////////////////////////////////////////////////////////end of program\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

