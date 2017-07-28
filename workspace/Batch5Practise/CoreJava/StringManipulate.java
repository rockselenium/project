package CoreJava;

public class StringManipulate {

	public static void main(String[] args) {
		String var="( System Administrator - Username : sysadmin | Password : sysadsdsdsdsmsdin )";
		
		String username=var.split(":")[1];
		System.out.println(username.split("[|]")[0].s);
		


	}

}
