// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
	
	// function to add a customer to all the customers is the shop
	public static ArrayList<Customer> addCustomer (ArrayList<Customer> Customers)
	{
		System.out.println("Add customer");
		System.out.println("----------------------------------------------------");
		int Answer = 1;
		Scanner input = new Scanner (System.in);
		while (Answer == 1)
		{
			Customer customer_To_Add = new Customer();
			Customers.add(customer_To_Add);		
			do
			{
				System.out.println("would you like to add another customer?");
				System.out.println("1 = yes");
				System.out.println("0 = no");
				Answer = input.nextInt();
			} while (Answer != 1 && Answer != 0);
		}
			
		return Customers;
	}
	
	// function to add a order to all the orders is the shop
	public static ArrayList<Order> addOrderToOrders (ArrayList<Order> Orders, ArrayList<Flower> Flowers_In_Stock)
	{
		System.out.println("Add Order");
		System.out.println("----------------------------------------------------");
		int Answer = 1;
		Scanner input = new Scanner (System.in);
		while (Answer == 1)
		{
			Order Order = new Order(Flowers_In_Stock);
			Orders.add(Order);		
			do
			{
				System.out.println("would you like to add another order to your orders?");
				System.out.println("1 = yes");
				System.out.println("0 = no");
				Answer = input.nextInt();
			} while (Answer != 1 && Answer != 0);
		}
			
		return Orders;
	}
	
	// function to add a flower to an order
	public static ArrayList<Flower> addFlowersToOrder (ArrayList<Flower> Flowers_In_Stock)
	{
		int Answer = 1;
		int flowerToOrder = 0;
		int typeOfFlower = 0;
		ArrayList<Flower> flowersOrder = new ArrayList<Flower>();
		Scanner input = new Scanner (System.in);
		while (Answer == 1) 
		{
			do 
			{
				System.out.println("Please pick a type of flower 1-2 to take from stock: ");
				System.out.println("1 - FFlower ");
				System.out.println("2 - SFlower ");
				typeOfFlower = input.nextInt();
				System.out.println("Please pick a flower between 0-9 to take from stock: ");
				flowerToOrder = input.nextInt();	
				if (flowerToOrder < 0 || flowerToOrder > 9 || typeOfFlower < 1 || typeOfFlower > 2)
				{
					System.out.println("Invalid input!");
				}
			} while (!(flowerToOrder > 0) || !(flowerToOrder <= 9) || !(typeOfFlower == 1 || typeOfFlower == 2));
			
			if (typeOfFlower == 1) 
			{
				flowersOrder.add(Flowers_In_Stock.get(flowerToOrder));
			}
			
			if (typeOfFlower == 2) 
			{
				flowersOrder.add(Flowers_In_Stock.get(flowerToOrder+10));
			}	
			do
			{
				System.out.println("would you like to add another flower to your order?");
				System.out.println("1 = yes");
				System.out.println("0 = no");
				Answer = input.nextInt();
			} while (Answer != 1 && Answer != 0);
		}
		System.out.println("your order is done!");
		return flowersOrder;
	}
	
	public static boolean boolToNum(int Answer)
	{
		if (Answer == 1)
			return true;
		
		return false;
	}
	
	// function to view a customer and his orders in the shop
	public static void getSingleCustomerDescription(Customer Customer, ArrayList<Order> Orders)
	{
		System.out.println(Customer);
		for (Order Order : Orders)
		{
			if (Order.getCustomer_id() == Customer.getCustomer_id())
			{
				System.out.println("----------------------------------------------------");
				System.out.println(Order);
				for (Flower Flower : Order.getFlowers())
				{
					System.out.println(Flower);
				}
			}
		}		
	}
	
	// function to view a customer by id and his orders in the shop
	public static void getCustomerDescriptionById(ArrayList<Customer> Customers,int Customer_id, ArrayList<Order> Orders)
	{
		for (Customer Customer : Customers)
		{
			if (Customer.getCustomer_id() == Customer_id) 
			{
				Service.getSingleCustomerDescription(Customer, Orders);
			}
		}
	}
	
	// function to view all customers and all there orders in the shop
	public static void getCustomersDescription(ArrayList<Customer> Customers, ArrayList<Order> Orders)
	{
		System.out.println("View customers description");
		System.out.println("----------------------------------------------------");
		if (Customers.isEmpty())
		{
			System.out.println("there are no customers!");
			if (Orders.isEmpty())
			{
				System.out.println("there are no orders!");
				return;
			}	
			return;
		}
		int Answer = 1;		
		int All_or_one = 1;
		Scanner input = new Scanner (System.in);
		do
		{
			System.out.println("would you like to view a specific customer or all customers");
			System.out.println("1 = specific customer");
			System.out.println("0 = all customers");
			All_or_one = input.nextInt();
		} while (All_or_one != 1 && All_or_one != 0);
		
		if (All_or_one == 1)
		{
			while (Answer == 1)
			{
				System.out.println("please enter a customer id: ");
				int Customer_id = input.nextInt();
				Service.getCustomerDescriptionById(Customers, Customer_id, Orders);
				do
				{
					System.out.println("would you like to see another customer description?");
					System.out.println("1 = yes");
					System.out.println("0 = no");
					Answer = input.nextInt();
				} while (Answer != 1 && Answer != 0);			
			}		
		}
		
		if (All_or_one == 0)
		{
			for (Customer Customer : Customers)
			{
				Service.getSingleCustomerDescription(Customer, Orders);
				System.out.println("No more orders for this customer!");
				System.out.println("----------------------------------------------------");
			}		
		}
	}
	
	// function to view a flower
	public static void getFlowerDescription(ArrayList<Flower> Flowers_In_Stock)
	{
		System.out.println("View flowers description");
		System.out.println("----------------------------------------------------");
		for (Flower Flower : Flowers_In_Stock)
		{
			System.out.println("Flower named " + Flower.getFlower_name() + " ia a: ");
			
			if (Flower instanceof FragrantFlower)
				System.out.println("FragrantFlower :-)");
			
			if (Flower instanceof SeasonalFlower)
				System.out.println("SeasonalFlower <:-)");
				
			if (!(Flower instanceof SeasonalFlower) && !(Flower instanceof FragrantFlower))
				System.out.println("Regular Flower :-(");
		}
		System.out.println("----------------------------------------------------");
	}
	
	public static int getlevel(int Price) 
	{
		if (Price <= 50)
		return 1;

		if (Price >= 51 && Price <= 100)
		return 2;
		
		if (Price >= 100)
		return 3;
		
		return 0;
	}
	
	public static String getpricelevel(int num) 
	{
		if (num == 1)
			return "LOW";
					
		if (num == 2)
			return "MEDIUM";
		
		if (num == 3)
			return "HIGH";
		
		return "all done!";
	}

	public static void main(String[] args) {
		

	}

}
