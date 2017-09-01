package basic;

public class Weather {
	public static void main(String[] args){
		//This program will give recommendations on what to wear based on temperature and sun condition.
		
		int temperature = 20;
		String sunCondition = "Overcast";
		
		if (temperature > 23){
			System.out.println("It's pleasant outside try a pair of shorts and a tshirt.");
		}else if((temperature > 18) && (sunCondition == "Sunny")){
			System.out.println("It's a little cooler perhaps wear a long sleeve shirt and a pair of jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}else if((temperature > 16) || (sunCondition == "Overcast")){
			System.out.println("It's a cool day make sure to wear thicker clothing.");
		}
		else{
			System.out.println("Looks like a cold day bring a warm jacket.");
		}
	}
}
