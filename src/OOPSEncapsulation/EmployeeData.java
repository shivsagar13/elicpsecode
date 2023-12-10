package OOPSEncapsulation;

public class EmployeeData {

	//create the Private Variables-- private variables can not accssed from outside the class
	private int empID;
	private String empname;
	private int empage;
	
	//getter and setter method: to get and set the value of the filed
	public void setID(int ID)
	{
		this.empID=ID;		
	}
	public int getID()
	{
		return empID;
	}
	public String getEmpname()
	{
		return empname;
	}
	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}
	public int getEmpage() 
	{
		return empage;
	}
	public void setEmpage(int empage)
	{
		this.empage = empage;
	}
	
	
	
	
	
	
}
