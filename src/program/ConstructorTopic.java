package program;

public class ConstructorTopic {

	 ConstructorTopic()
	 {
		 System.out.println("i am Default constructor");
		 
	 }
	

	 ConstructorTopic(int a,String s,float f,char c)
	 {
		 
		 System.out.println("i am parametize constructor");
	 }
	 
	 ConstructorTopic(int a,String s)
	 {
		 
		 System.out.println("i am parametize constructor");
	 }
	 
	 ConstructorTopic(String s,String a,String f)
	 {
		 System.out.println("i am parametize constructor"); 
	 }
	 
	 public static void main(String[] args) {
		 ConstructorTopic obj=new ConstructorTopic ();
		 ConstructorTopic obja=new ConstructorTopic (10,"sagar",20.5f,'s');
		 ConstructorTopic objb=new ConstructorTopic (10,"sagar");
		 ConstructorTopic objc=new ConstructorTopic ("sagar","sagar","sagar");
	}
	 
	 
}
