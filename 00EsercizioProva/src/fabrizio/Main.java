package fabrizio;

public class Main {
	
	public static void main( String args[] ) {
		
		Person marco = new Person();
		
		marco.setId(1);
		marco.setName("Marco");
		
		Person mario = new Person(2,"Mario");
		
		int[] ages = {1,2,3,4};
		int[] ages2 = new int [5];
		
		// syso + ctrl + space
		System.out.println(ages2[0]);
		
		Person [] persons = {mario,marco };
		
		Person [] persons2 = new Person[2];
		Person [] persons3 = new Person[3];
		
		for (int i=0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int i=0; i < persons.length; i++) {
			//System.out.println(persons[i].getId());
			//System.out.println(persons[i].getName());
			System.out.println(persons[i]);
			//persons[i].printPerson();
			//System.out.println(persons[i].getPersonDetails());
		}
		printIntArray(ages);
		// Genera una NullPointerException
		// persons3[].setName("giorgio");
		// per una struttura dati complessa un oggetto devo instanziarlo per allocare mem
		persons3[0] = new Person(0,"giorgio");
		persons3[0].setName("pippo");
		Person giorgio = persons3[0];
		giorgio.setName("pluto");
		System.out.println(giorgio);
		System.out.println(persons3[0]);
		//printPersonArray(persons3);
		
	}

	public static void printIntArray(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void printPersonArray(Person[] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
