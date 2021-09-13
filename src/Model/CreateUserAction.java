package Model;

public abstract class CreateUserAction {
	private String userName;
	
	public void setUserNameToCreate(String userName) {
		this.userName = userName;
	}
	
	abstract boolean excute();
}
