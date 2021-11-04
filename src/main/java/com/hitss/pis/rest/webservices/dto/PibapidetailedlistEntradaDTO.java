package com.hitss.pis.rest.webservices.dto;

public class PibapidetailedlistEntradaDTO {

	private String employeeNumber;
	private String subtype;
	private String timeIntervallow;
	private String timeIntervalhigh;

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getTimeIntervallow() {
		return timeIntervallow;
	}

	public void setTimeIntervallow(String timeIntervallow) {
		this.timeIntervallow = timeIntervallow;
	}

	public String getTimeIntervalhigh() {
		return timeIntervalhigh;
	}

	public void setTimeIntervalhigh(String timeIntervalhigh) {
		this.timeIntervalhigh = timeIntervalhigh;
	}

	@Override
	public String toString() {
		return "PibapidetailedlistEntradaDTO [employeeNumber=" + employeeNumber + ", subtype=" + subtype
				+ ", timeIntervallow=" + timeIntervallow + ", timeIntervalhigh=" + timeIntervalhigh + "]";
	}

}
