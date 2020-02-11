package customexception;

public class Test extends CustomException {
	static String s="dinesh";
	public static void main(String[] args) throws CustomException {
		
		if (s.equals("dinesh")) {
			System.out.println("string is not equal");
		}
		else {
			throw new CustomException();
		}	
		
	}
	}