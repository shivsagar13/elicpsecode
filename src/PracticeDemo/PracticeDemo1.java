package PracticeDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo1 {

 public static void main(String[] args) {
  
	    String str="welcome";
	    int count=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	    	{
	    		
	    		System.out.println("Given string contains:"+ str.charAt(i) +" index number "+i);
	    		count++;
	    	}	    	
	    }System.out.println("count vowels:"+count);	    
	  }
	
}


