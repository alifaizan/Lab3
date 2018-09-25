
public class BuddyInfo {

private String name;
private String address;
private String phonenum;

public BuddyInfo(String name, String address, String phonenum){
	this.name=name;
	this.address=address;
	this.phonenum=phonenum;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhonenum() {
	return phonenum;
}
public void setPhonenum(String phonenum) {
	this.phonenum = phonenum;
}


	public static void main(String[] args) {
		
		BuddyInfo bud = new BuddyInfo("Homer","Carleton","613");
		System.out.println("Hello, " + bud.getName());

	}

}
