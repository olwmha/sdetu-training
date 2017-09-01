package basic;

public class Cities {
	public static void main(String[] args){
		//Declare and define an array.
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println("*********************");
		//Declare the array explicitly
		String[] provinces = new String[9];
		provinces[0] = "Eastern Cape";
		provinces[1] = "Gauteng";
		provinces[2] = "Limpopo";
		provinces[3] = "Western Cape";
		provinces[4] = "Mpumalanga";
		provinces[5] = "North West";
		provinces[6] = "Northern Cape";
		provinces[7] = "KwaZulu-Natal";
		provinces[8] = "Free State";
		
		//Loops through the array then tests the condition whilst the while loop tests the condition and then goes through the loop
		int i = 0;
		
		do{
			System.out.println("Pronvince:" + provinces[i]);
			i = i + 1;
		}while(i < 8);
		
		System.out.println("***************");
		
		int n = 0;
		boolean provinceFound = false;
		while(!provinceFound){
			String province = provinces[n];
			System.out.println(province);
			if (province == "Western Cape"){
				System.out.println("Province found!");
				provinceFound = true;
			}
			n++;
			
		}
				
	}
	
		
}
