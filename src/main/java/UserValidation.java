import java.util.ResourceBundle;

public class UserValidation {
	public boolean userValidation(String inUID,String inPSW)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UID=rb.getString("uname");
		String PSW=rb.getString("psw");
		if(UID.equalsIgnoreCase(inUID) && PSW.equals(inPSW))
			return true;
		else
			return false;
	}

}
