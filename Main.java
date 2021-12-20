// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static ArrayList<Customer> Init_Customers()
	{
		ArrayList<Customer> Customers = new ArrayList<Customer>();
		return Customers;
	}
	
	public static ArrayList<Order> Init_Orders()
	{
		ArrayList<Order> Orders = new ArrayList<Order>();
		return Orders;
	}
	
	public static ArrayList<Flower> Init_flowers_In_Stock()
	{
		ArrayList<Flower> Flowers_In_Stock = new ArrayList<Flower>();
		FragrantFlower FFlower1 = new FragrantFlower("Flower1", 10, "Red", "North");
		FragrantFlower FFlower2 = new FragrantFlower("Flower2", 15, "Blue", "North");
		FragrantFlower FFlower3 = new FragrantFlower("Flower3", 25, "Teal", "North");
		FragrantFlower FFlower4 = new FragrantFlower("Flower4", 30, "Purple", "West");
		FragrantFlower FFlower5 = new FragrantFlower("Flower5", 40, "Orange", "West");
		FragrantFlower FFlower6 = new FragrantFlower("Flower6", 50, "White", "West");
		FragrantFlower FFlower7 = new FragrantFlower("Flower7", 60, "Pink", "East");
		FragrantFlower FFlower8 = new FragrantFlower("Flower8", 80, "Yellow", "East");
		FragrantFlower FFlower9 = new FragrantFlower("Flower9", 100, "Brown", "South");
		FragrantFlower FFlower10 = new FragrantFlower("Flower10", 120, "Black", "South");	
		
		SeasonalFlower SFlower11 = new SeasonalFlower("Flower11", 11, "Spring" , true);
		SeasonalFlower SFlower12 = new SeasonalFlower("Flower12", 16, "Spring" , false);
		SeasonalFlower SFlower13 = new SeasonalFlower("Flower13", 26, "Spring" , true);
		SeasonalFlower SFlower14 = new SeasonalFlower("Flower14", 31, "Winter" , false);
		SeasonalFlower SFlower15 = new SeasonalFlower("Flower15", 41, "Winter" , true);
		SeasonalFlower SFlower16 = new SeasonalFlower("Flower16", 51, "Summer" , false);
		SeasonalFlower SFlower17 = new SeasonalFlower("Flower17", 61, "Summer" , true);
		SeasonalFlower SFlower18 = new SeasonalFlower("Flower18", 81, "Autumn" , false);
		SeasonalFlower SFlower19 = new SeasonalFlower("Flower19", 101, "Autumn" , true);
		SeasonalFlower SFlower20 = new SeasonalFlower("Flower20", 121, "Autumn" , false);
		Flowers_In_Stock.add(FFlower1);
		Flowers_In_Stock.add(FFlower2);
		Flowers_In_Stock.add(FFlower3);
		Flowers_In_Stock.add(FFlower4);
		Flowers_In_Stock.add(FFlower5);
		Flowers_In_Stock.add(FFlower6);
		Flowers_In_Stock.add(FFlower7);
		Flowers_In_Stock.add(FFlower8);
		Flowers_In_Stock.add(FFlower9);
		Flowers_In_Stock.add(FFlower10);
		Flowers_In_Stock.add(SFlower11);
		Flowers_In_Stock.add(SFlower12);
		Flowers_In_Stock.add(SFlower13);
		Flowers_In_Stock.add(SFlower14);
		Flowers_In_Stock.add(SFlower15);
		Flowers_In_Stock.add(SFlower16);
		Flowers_In_Stock.add(SFlower17);
		Flowers_In_Stock.add(SFlower18);
		Flowers_In_Stock.add(SFlower19);
		Flowers_In_Stock.add(SFlower20);
		return Flowers_In_Stock;
	}
	
	// main function to operate the flower shop AKA interface
	public static void Flower_shop()
	{
		ArrayList<Customer> Customers = Init_Customers();
		ArrayList<Flower> Flowers_In_Stock = Init_flowers_In_Stock();
		ArrayList<Order> Orders = Init_Orders();
		int pick_action = 0;
		System.out.println("Welcome to your flower shop!");
		do
		{
			System.out.println("what would you like to do?");
			System.out.println("1 = Add a new Customer");
			System.out.println("2 = Add a new Order");
			System.out.println("3 = View customers description");
			System.out.println("4 = View flowers in stock description");
			System.out.println("0 = exit");
			Scanner input = new Scanner (System.in);
			pick_action = input.nextInt();
			
			if (pick_action < 0 || pick_action > 4)
			{
				System.out.println("INVALID INPUT!");
			}
			
			if (pick_action == 1) 
			{
				Service.addCustomer(Customers);				
			}
			
			else if (pick_action == 2)
			{
				Service.addOrderToOrders(Orders, Flowers_In_Stock);			
			}
			
			else if (pick_action == 3)
			{
				Service.getCustomersDescription(Customers, Orders);							
			}
			
			else if (pick_action == 4)
			{
				Service.getFlowerDescription(Flowers_In_Stock);
			}
			
			else if (pick_action == 0)
			{
				System.out.println("Thank you and goodbye!");
				break;
			}
			
		} while (pick_action > 0 && pick_action < 5);
		System.out.println("ALL DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	
	}
	


	public static void main(String[] args) {
		Flower_shop();
	}
}

