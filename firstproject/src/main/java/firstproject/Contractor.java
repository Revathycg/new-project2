package firstproject;

public  class Contractor extends Employee {
	
		 
		 

	 void calculatesalary() {
		 int ph=100;
		 int wh=6;
		 int salary= ph*wh;
		 
		 System.out.println("salary for regular employee="+salary);}
		 
		 
	 public static void main(String args[]) {
	Contractor obj=new Contractor();
	obj.calculatesalary();
	 }

}