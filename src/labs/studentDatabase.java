package labs;

public class studentDatabase {

	public static void main(String[] args) {
		Student stu1=new Student("Dorci","123232246");
		Student stu2=new Student("Dorka","144232233");
		Student stu3=new Student("Dori","165443281");
		
		stu1.enroll("Aranymetszés");
		stu1.enroll("Ezüstvágás");
		stu1.enroll("Rézöntés");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		

	}

}

class Student{
	private static int iD=0;
	private int userId;
	String name;
	String ssn;
	private String email;
	public String courses="";
	private static final int costofCourse=800;
	private int balance=0;
	
	public Student(String name,String ssn){
		iD++;
		this.name=name;
		this.ssn=ssn;
		setuserId();
		setEmail();
		
	}
	private void setuserId(){
		int max=9000;
		int min=1000;
		int random= (int) (Math.random() * (max-min));
		random=random+min;
		String userId=iD+""+random+ssn.substring(5);
		System.out.println("Your userID is: " +userId);
	}
	
	private void setEmail(){
		email= name.toLowerCase()+ "." + iD +"@beingfab.com";
		System.out.println("Your email is: " + email);
	}
	public void enroll(String course){
		this.courses=this.courses +"\n"+course;
		
		balance= balance+costofCourse;
		
	}
	public void payTuition(int amount){
		System.out.println("Payment: $"+amount);
		balance=balance-amount;
		
	}
	public void checkBalance(){
		System.out.println("\nBalance : $"+balance);
		
	}
	public void showCourses(){
		System.out.println(courses);
		
	}
	public String toString(){
		return "[Name:" + name +"]" + "\n[Courses:" + courses + "]" +"\n[Balance: $" + balance +"]";
		
	}
}