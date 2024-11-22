package com.redesProfesionales.backend.model;

public class CompanyData {
	
	private String address;
	private String foundationDate;
	private int workers;
	private String workField;
	
	public CompanyData(String address, String foundationDate, int workers, String workField) {
		this.address = address;
		this.foundationDate = foundationDate;
		this.workers = workers;
		this.workField = workField;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}

	public int getWorkers() {
		return workers;
	}

	public void setWorkers(int workers) {
		this.workers = workers;
	}

	public String getWorkField() {
		return workField;
	}

	public void setWorkField(String workField) {
		this.workField = workField;
	}

	@Override
	public String toString() {
		return "CompanyData [address=" + address + ", foundationDate=" + foundationDate + ", workers=" + workers
				+ ", workField=" + workField + "]";
	}
}
