class Form  
{
	String name;
	long num;
	int age ;
	String email;
	String loc;
	
	long altNum;
	String blood;
	String temLoc;
Form() {
	}
Form(String name,long num,int age, String email,String loc)
{
	this.name=name;
	this.num=num;
	this.age=age;
	this.email=email;
	this.loc=loc;

} 	
Form(String name,long num,int age, String email,String loc,long altNum)
{
	this(name,num,age,email,loc);
	this.altNum=altNum;
}
Form(String name,long num,int age, String email,String loc,long altNum,String blood)
{
	this(name,num,age,email,loc,altNum);
	this.blood=blood;
}
Form(String name,long num,int age, String email,String loc,long altNum,String blood,String temLoc)
{
	this(name,num,age,email,loc,altNum,blood);	
	this.temLoc=temLoc;
}
public void displayForm()
{
	System.out.println("Name: "+name);
	System.out.println("Number: "+num);
	System.out.println("Age: "+age);
	System.out.println("Email: "+email);
	System.out.println("Location: "+loc);
	System.out.println("Alternate Number: "+altNum);
	System.out.println("Blood: "+blood);
	System.out.println("temporary Location: "+temLoc);
}
	
	

}