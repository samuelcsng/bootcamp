package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder{
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		// complete the function
		// return null;
		return this.companyName;
	}

	// public int getTaxId() {
	// 	return super.getIdNumber();
	// }

	
}
