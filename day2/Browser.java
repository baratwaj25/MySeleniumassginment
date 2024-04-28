package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser br = new Browser();
		System.out.println(br.launchBrowser("Chrome"));
		br.loadurl();
		

	}

	public String launchBrowser(String name) {
		// TODO Auto-generated method stub
		System.out.println("browser launched sucessfully");
		return name;
	}
	public void loadurl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded  sucessfully");
		
		
	}
	

}
