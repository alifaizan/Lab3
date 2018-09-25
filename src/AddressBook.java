import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddylist;
	
	public AddressBook(){
		this.buddylist = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo){
		
		if(aBuddyInfo!=null){
			
			buddylist.add(aBuddyInfo);
		}
	}
	
	public BuddyInfo removeBuddy(int index){
		
		if(index>=0 && index < buddylist.size()){
			
			return buddylist.remove(index);
		}
		return null;
	}
	
	public static void main (String[] args){
		
		BuddyInfo bud = new BuddyInfo("Tom","Carleton","416");
		AddressBook addBook = new AddressBook();
		addBook.addBuddy(bud);
		addBook.removeBuddy(0);
	}
}
