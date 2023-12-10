package StaticKeyword;

   public class StaticKeywordDemo1 {
    void m1()
	{
   final  int a=10;
 //  a=a+10;
    System.out.println(a);
    }
   public static void main(String[] args) {
	   StaticKeywordDemo1 obj=new StaticKeywordDemo1() ;
	   obj.  m1();
		
	}
}
