package basics;


public class Cities {

	public static void main(String[] args) {
		// Declare and define array
		
		String[] cities = {"New york" , "Miami", "Los Angeles", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		
		//Declare array
		String[] countries;
		
		//define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		System.out.println("*************************");

		//declare & define the array(only size)
				String[] states = new String[5];
				states[0] = "California";
				states[1] = "Ohio";
				states[2] = "New Jersey";
				states[3] = "Texas";
				states[4] = "California";
				int i = 0;
				
				//Do loop: enters the loop THEN test Condition
				do {
					System.out.println("STATE: " + states[i]);
					i++;
					
				}while (i < 5);
					
			//While Loop: Test condition first then enters loop
				int n = 0 ;
				boolean stateFound = false;
				while(!stateFound) {
					String state = states[n];
					System.out.println(state);
					if (state == "Texas") {
						System.out.println("State found!");
						stateFound = true;
					}
					n++;
				}
				System.out.println("\nPrinting with for loop\n");
				//For loops: best Structures for iterating through an array
				
				for(int x = 0; x < 5; x++) {
					System.out.println(states[x]);
				}
	}

}
