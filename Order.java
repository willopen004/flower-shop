// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

import java.util.ArrayList;
import java.util.Scanner;
public class Order {
	
	// Fields  --------------------------------------------------
	private int Order_code;
	private int Customer_id;
	private ArrayList<Flower> Flowers;
	
	// C'Tor ----------------------------------------------------
	Order (ArrayList<Flower> flowers_In_Stock)
	{
		setOrder_code();
		setCustomer_id();
		setFlowers(flowers_In_Stock);
	}


	// Methods --------------------------------------------------
	public int getOrder_code() {
		return Order_code;
	}

	public void setOrder_code() {
		System.out.println("please enter order code (4 digits): ");
		Scanner input = new Scanner (System.in);
		int Order_code_to_set = input.nextInt();
		while (Order_code_to_set > 9999 || Order_code_to_set < 1)
		{
			System.out.println("INVALID INPUT!");
			System.out.println("please enter order code (4 digits): ");
			Order_code_to_set = input.nextInt();
		}
		Order_code = Order_code_to_set;
	}

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id() {
		System.out.println("please enter customer id (4 digits): ");
		Scanner input = new Scanner (System.in);
		int Customer_id_to_set = input.nextInt();
		while (Customer_id_to_set > 9999 || Customer_id_to_set < 1)
		{
			System.out.println("INVALID INPUT!");
			System.out.println("please enter customer id (4 digits): ");
			Customer_id_to_set = input.nextInt();
		}
		Customer_id = Customer_id_to_set;
	}

	public ArrayList<Flower> getFlowers() {
		return Flowers;
	}

	public void setFlowers(ArrayList<Flower> flowers_In_Stock) {
		System.out.println("please enter flowers to your order: ");			
		Flowers = Service.addFlowersToOrder(flowers_In_Stock);
	}
	
	public String toString()
    {
        return "Order code is: " + Order_code + " | Customer id is: " + Customer_id
        		+ " | Flowers of the Order are: ";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
