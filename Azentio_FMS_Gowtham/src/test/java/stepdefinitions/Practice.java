package stepdefinitions;

public class Practice {public Practice() {
	// TODO Auto-generated constructor stub
}public static void main(String[] args) {
	
	String checkammount = "10.2";
	double i=Double.parseDouble(checkammount);
	boolean isDecimal = i % 1 != 0;
	System.out.println(isDecimal);
}
}
