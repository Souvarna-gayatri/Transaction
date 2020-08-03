package com.wipro.bean;

public class Accountbean {
	
	private int Accountid;
	private String Accountname;
	private int Accountbal;
	
	public String getAccountname() {
		return Accountname;
	}

	public void setAccountname(String accountname) {
		Accountname = accountname;
	}

	
	public void setAccountid(int Accountid)
	{
		this.Accountid=Accountid;
	}

	public int getAccountbal() {
		return Accountbal;
	}

	public void setAccountbal(int accountbal) {
		Accountbal = accountbal;
	}

	public int getAccountid() {
		return Accountid;
	}

}
