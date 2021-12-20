// TCSD 14 JAVA Course HW_1
// Yiftach navot 304956279
// Rannan tivoni 302500228

public class SeasonalFlower extends Flower {

	// Fields  --------------------------------------------------
	private String Flower_Season;
	private boolean Flower_isGreen;
	
	// C'Tor ----------------------------------------------------
	SeasonalFlower(String Flower_name, int Flower_price, String Flower_Season, boolean Flower_isGreen)
	{
		super(Flower_name, Flower_price);
		setSeason(Flower_Season);
		setGreen(Flower_isGreen);
	}
	
	// Methods --------------------------------------------------
	public String getSeason() {
		return Flower_Season;
	}
	public void setSeason(String flower_Season) {
		Flower_Season = flower_Season;
	}
	public boolean isGreen() {
		return Flower_isGreen;
	}
	public void setGreen(boolean flower_isGreen) {
		Flower_isGreen = flower_isGreen;
	}
	
	public String toString()
    {
        return "Flower name is: " + Flower_name + " | Flower price is: " + Service.getpricelevel(Service.getlevel(Flower_price))
        		+ " | Flower season is: " + Flower_Season + " | Flower is green? " + Flower_isGreen;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
