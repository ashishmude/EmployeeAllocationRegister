package com.mpallocationreg;

import java.io.File;
import java.util.List;


public class Employee {

	private long id;
	
	private long employeeId;
	
	private String firtName;
	
	private String lastName;
	
	private List<EmployeeAllocation> allocationDetails;
	
	private EmployeeSkills employeeSkills;
	
	private File oneSliderProfile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<EmployeeAllocation> getAllocationDetails() {
		return allocationDetails;
	}

	public void setAllocationDetails(List<EmployeeAllocation> allocationDetails) {
		this.allocationDetails = allocationDetails;
	}

	public EmployeeSkills getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(EmployeeSkills employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public File getOneSliderProfile() {
		return oneSliderProfile;
	}

	public void setOneSliderProfile(File oneSliderProfile) {
		this.oneSliderProfile = oneSliderProfile;
	}

	
}