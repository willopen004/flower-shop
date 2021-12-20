// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

public class FragrantFlower extends Flower {
	
	// Fields ---------------------------------------------------
	private String Flower_color;
	private String Flower_area;
	
	// C'Tor ----------------------------------------------------
	FragrantFlower(String Flower_name, int Flower_price, String Flower_color, String Flower_area)
	{
		super(Flower_name, Flower_price);
		setFlower_color(Flower_color);
		setFlower_area(Flower_area);
	}
	
	// Methods --------------------------------------------------
	public String getFlower_color() {
		return Flower_color;
	}


	public void setFlower_color(String flower_color) {
		Flower_color = flower_color;
	}


	public String getFlower_area() {
		return Flower_area;
	}


	public void setFlower_area(String flower_area) {
		Flower_area = flower_area;
	}

	public String toString()
    {
        return "Flower name is: " + Flower_name + " | Flower price is: " + Service.getpricelevel(Service.getlevel(Flower_price))
        		+ " | Flower color is: " + Flower_color + " | Flower area is: " + Flower_area;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
