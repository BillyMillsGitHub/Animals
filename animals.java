package animals;

	


public class animals {
	
	
	//Attributes
	private String name;
	private String location;
	private int weight;
	private int age;
	//default constructor 
	public animals() {}
	
			
	// constructor with data set within
			public animals(String name, String location, int weight, int age) {
			this.name = name;
			this.location = location;
			this.weight = weight;
			this.age = age;

			
			}
			

@Override
			public String toString() {
				return "animals [name=" + "Orangutan" + ", location=" + "Borneo" + ", weight=" + 55 + ", age=" + 7 + "]";
			} 
//second animal
			
			public String toString1() {
				return "animals [name=" + "Jaguar" + ", location=" + "North America" + ", weight=" + 90 + ", age=" + 5 + "]";

			}
	
	
			}

	
		


	
	


//Create a class of your choice, Create 4 private attributes in the class, 
//and create 5 different constructors, and then have a go at calling these different constructors from the main runner class (the class with the main method)