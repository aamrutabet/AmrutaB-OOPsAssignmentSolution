package dept;

public class DeptMain {
	public static void main(String args[]) {
		AdminDept adminD = new AdminDept();
		System.out.println(" Welcome to " + adminD.departmentName());
		System.out.println(adminD.getTodaysWork());
		System.out.println(adminD.getWorkDeadline());
		System.out.println(adminD.isTodayAHoliday());
		System.out.println();

		HRDept hrD = new HRDept();
		System.out.println(" Welcome to " + hrD.departmentName());
		System.out.println(hrD.doActivity());
		System.out.println(hrD.getTodaysWork());
		System.out.println(hrD.getWorkDeadline());
		System.out.println(hrD.isTodayAHoliday());
		
		System.out.println();
		TechDept techD = new TechDept();
		System.out.println(" Welcome to " + techD.departmentName());
		System.out.println(techD.getTodaysWork());
		System.out.println(techD.getWorkDeadline());
		System.out.println(techD.getTechStackInformation());
		System.out.println(techD.isTodayAHoliday());

	}
}
