// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

import java.util.Scanner;
public class Customer {
	
	// Fields  --------------------------------------------------
	private String Customer_first_name;
	private String Customer_last_name;
	private int Customer_creditNum;
	private int Customer_id;
	
	// C'Tor ----------------------------------------------------
	Customer ()
	{
		setCustomer_name();
		setCustomer_id();
		setCustomer_creditNum();
	}
	
	// Methods --------------------------------------------------
	public String getCustomer_name() {
		return Customer_first_name + Customer_last_name;
	}


	public void setCustomer_name() {
		System.out.println("please enter customer first name: ");
		Scanner input = new Scanner (System.in);
		String Customer_first_name_to_set = input.next();
		Customer_first_name = Customer_first_name_to_set;
		System.out.println("please enter customer last name: ");
		String Customer_last_name_to_set = input.next();
		Customer_last_name = Customer_last_name_to_set;
	}

	public int getCustomer_id() {
		return Customer_id;
	}


	public void setCustomer_id() {
		System.out.println("please enter customer id (4 digits): ");
		Scanner input = new Scanner (System.in);
		int Customer_id_set = input.nextInt();
		while (Customer_id_set > 9999|| Customer_id_set < 1)
		{
			System.out.println("INVALID INPUT!");
			System.out.println("please enter customer id (4 digits): ");
			Customer_id_set = input.nextInt();
		}
		Customer_id = Customer_id_set;
	}
	public int getCustomer_creditNum() {
		return Customer_creditNum;
	}
	
	
	public void setCustomer_creditNum() {
		System.out.println("please enter customer creditNum (4 digits): ");
		Scanner input = new Scanner (System.in);
		int Customer_creditNum_set = input.nextInt();
		while (Customer_creditNum_set > 9999 || Customer_creditNum_set < 1)
		{
			System.out.println("INVALID INPUT!");
			System.out.println("please enter customer creditNum (4 digits): ");
			Customer_creditNum_set = input.nextInt();
		}
		Customer_creditNum = Customer_creditNum_set;
	}

	public String toString()
    {
        return "Customer name is: " + Customer_first_name + " " + Customer_last_name + " | Customer id is: " + Customer_id
        		+ " | Customer creditnNum is: " + Customer_creditNum;
    }

	public static void main(String[] args) {


	}

}
