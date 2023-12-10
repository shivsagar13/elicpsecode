package OOPSEncapsulation;

public class HideEmpData extends EmployeeData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HideEmpData obj=new HideEmpData();
		obj.setID(22);
		obj.setEmpname("ram");
		obj.setEmpage(50);
		
		System.out.println("Emp ID:"+obj.getID());
		System.out.println("Emp name:"+obj.getEmpname());
		System.out.println("Emp age:"+obj.getEmpage());
	   }
	   }
