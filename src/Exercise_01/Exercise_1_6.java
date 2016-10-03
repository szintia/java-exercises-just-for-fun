package Exercise_01;

public class Exercise_1_6 {

	/**
	 * Task: Using copy constructor.
	 * 
	 * Copy constructor: it is a constructor that takes only one parameter which is the same type
	 * as the class in which the copy constructor is defined.
	 * With the newly created copy(has the same values) will be independent of the original object.
	 * 
	 * Unnecessary for immutable objects
	 * 
	 * @author szintia
	 */
	private String name;
	private double number;
	
	//Parametrized constructor
	public Exercise_1_6(String name, double number) {
		this.name = name;
		this.number = number;
	}
	
	//Copy constructor
	public Exercise_1_6(Exercise_1_6 exercise) {
		name = exercise.name;
		number = exercise.number;
	}
	
	//Copy constructor is not needed because String is immutable object
	public String getName() {
		return name;
	}
	
	//Copy constructor is called.
	//A separate Exercise_1_6 object is created, it has the same values stored in the instance variable
	//but with it's own address space.
	public Exercise_1_6 getNumber() {
		return new Exercise_1_6(name, number);
	}
	
	//Overriding toString() method
 	public String toString() {
		return "The name of the exercise: " + name + " and it's number: " + number;
	}
	
	public static void main(String... args) {
		Exercise_1_6 exercise = new Exercise_1_6("Copy constructor", 1.6);
		Exercise_1_6 copyExercise = new Exercise_1_6(exercise);
		
		System.out.println(copyExercise);
	}
}
