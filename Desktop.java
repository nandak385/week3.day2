package week3.day2;

public class Desktop implements HardWare, Software {

	

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources Windows 10 pro 64bit");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardwareResources processor = intel i7 7700k");

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop details = new Desktop();
		details.softwareResources();
		details.hardwareResources();

	}

}
