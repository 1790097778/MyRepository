package save;

import data.DataManager;

public class PageControl {
	private int uesrType;
	private String userID;
	private DataManager mysql;
	public void setUserInfo(int userType,String userID){
		mysql = new DataManager();
		this.uesrType = userType;
		this.userID = userID;
	}
	public boolean[] getUserPage(){
		boolean page[]=new boolean[8];
		for(int i=0;i<8;i++)page[i]=true;
		return page;
	}
	
}
