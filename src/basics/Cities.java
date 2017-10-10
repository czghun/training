package basics;

public class Cities {

	public static void main (String[] args) {

	
	String[] cities = {"Szeged","Balázsttya","Zsombó","Kistelök"};
	System.out.println(cities[0]);
	System.out.println(cities[1]);
	System.out.println(cities[2]);
	System.out.println(cities[3]);
	
	String[] states = new String[5];
			states[0]="California";
			states[1]="Ohio";
			states[2]="New Jersey";
			states[3]="Utah";
			states[4]="Washington";
			System.out.println(states[0]);
			int i=0;
			do  {
				System.out.println(states[i]);
				i=i+1;
			} while (i<5);
	
	
	}
}
