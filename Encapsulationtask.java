package javaprogram;

public class Encapsulationtask {
	
		private  int rollno;
		private String name;
		private int age;
			public void setName(String name)
			{
				this.name=name;
			}
			public String getName()
			{
			     return name;
			}
			public void setAge(int age)
			{
				this.age=age;
			}
			public int getAge()
			{
			     return age;
			}
			public void setRollno(int rollno)
			{
				this.rollno=rollno;
			}
			public int getRollno()
			{
			     return rollno;
			}
			
			
			public static void main(String[] args) {
				Encapsulationtask e=new Encapsulationtask();
				e.setAge(22);
				e.setName("Surya");
				e.setRollno(60605);
				System.out.println("Name: "+e.getName());
				System.out.println("Age: "+e.getAge());
				System.out.println("Rollno: "+e.getRollno());


			}

		}

