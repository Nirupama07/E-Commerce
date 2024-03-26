package services;
import java.util.ArrayList;
import java.util.List;

import ecommerce.models.user;
public class LoginService {
List<user> users = new ArrayList<user>();
	
	public loginservice()
	{
		
	}
	public boolean createuser(String name,String email,String password) {
		user u = new user();
		u.setfirstname(name);
	
		u.setpassword(password);
		if(email.contains("@")) {
			u.setemail(email);
		}else {
			return false;
		}
		
		users.add(u);
		return true;
	}
	public user getuserbyemail(String email) {
		for(user u:users) {
			if(u.getemail().equals(email)) {
				return u;
			}
		}
		return null;
	}
}