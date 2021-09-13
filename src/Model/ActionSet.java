package Model;

public abstract class ActionSet { 
	abstract CreateUserAction getCreateUserAction();
	public boolean createUser(String userName) {
		CreateUserAction cmd =  this.getCreateUserAction();
		cmd.setUserNameToCreate(userName);
		return cmd.excute();
	}
}
