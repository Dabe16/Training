package basics;

public class weather {
	public static void main(String[] args) {
		//This program give suggestion of what to wear base on the weather(temperature) and su condition
		
		int temperature =  45;
		String sunCondtion ="OverCast"; 
		
		if( temperature > 80) {
			System.out.println("Ware short and tshirt");
		}
		else if (temperature > 60 && sunCondtion == "Sunny") {
			System.out.println("It's a little coooler wear long-sleeve and jeans.");
			System.out.println("Ware a hat to block the sun.");
		}
		else if (temperature > 50 || sunCondtion == "OverCast"){
			System.out.println("Cold day, make sure wear warmer cloths");
		}
		else {
			System.out.println("It's Cold outside, Bring sweater!");
		}
		System.out.println("The program is ending!");
			
	}

}
