package email_application;

public class Email {
    private String firstName, lastName, password, department, email, company = "flytxt.com"; 
    private int defaultPasslength=8;

    public Email(String f, String l, int dep) {
    	this.firstName = f;
        this.lastName = l;
        department = getDepartment(dep);
        email = makeEmail();
        password = makePassword(defaultPasslength);
    }
    private String  getDepartment(int d) {
    	if(d==1) {return "Sales";}
    	else if(d==2) {return "Development";}
    	else if(d==3) {return "Accounting";}
    	else {return "";}
    }
    private String makeEmail() {
    	return firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+company.toLowerCase();
    }
    private String makePassword(int passLength) {
    	String passSet = "QWERTYUIOPASDFGHJKLZXCVBNM234567890!@#$%^&*()_+";
    	char[] password = new char[passLength];
    	for(int i=0; i<passLength; i++) {password[i] = passSet.charAt((int)(Math.random()*passSet.length()));}
    	return new String(password);
    }
    public String getpassword() {
    	return password;
    }
    public String getmail() {
    	return email;
    }
    public String getdepartment() {
    	return department;
    }
}