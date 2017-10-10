package basics;

public class Weather {
 public static void main (String [] args){
	 
	 int temperature =55;
	 String SunCondition = "Overcast";
	 
	 if (temperature >80) {
	 System.out.println("Pleasant weather, wear shorts and t-shirt");
	 }
	 else if ((temperature >60) && (SunCondition == "Sunny")) {
	 System.out.println("A bit cold, wear trousers and a cardigan");
	 System.out.println("Wear a hat to block the sun");
	 }
	 else if (temperature >20) {
	 System.out.println("Cold wearther, wear a sweater and a jacket!");
	 }
	 else if ((temperature >50) || (SunCondition == "Overcast")) {
		 System.out.println("Chance of rain");
	 }
	 else {
		 System.out.println("Looks like a cold day");
	 }
	 System.out.println("the program now will exit");
 }
 
}
