// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

public class Flower {
	
	// Fields ---------------------------------------------------
	protected String Flower_name;
	protected int Flower_price;
	
	
	// C'Tor ----------------------------------------------------
	Flower (String Flower_name, int Flower_price)
	{
		setFlower_name(Flower_name);
		setFlower_price(Flower_price);
	}
	
	// Methods --------------------------------------------------

	public String getFlower_name() {
		return Flower_name;
	}

	public void setFlower_name(String flower_name) {
		Flower_name = flower_name;
	}

	public int getFlower_price() {
		return Flower_price;
	}

	public void setFlower_price(int flower_price) {
		Flower_price = flower_price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
