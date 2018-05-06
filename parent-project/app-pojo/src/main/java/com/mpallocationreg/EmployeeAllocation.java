package com.mpallocationreg;

import java.time.LocalDate;

import javax.persistence.OneToOne;

public class EmployeeAllocation {
	private long allocationId;
	private String accountName;
	private String projectName;
	private LocalDate allocationStartDate;
	private LocalDate allocationEndDate;
	public long getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(long allocationId) {
		this.allocationId = allocationId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public LocalDate getAllocationStartDate() {
		return allocationStartDate;
	}
	public void setAllocationStartDate(LocalDate allocationStartDate) {
		this.allocationStartDate = allocationStartDate;
	}
	public LocalDate getAllocationEndDate() {
		return allocationEndDate;
	}
	public void setAllocationEndDate(LocalDate allocationEndDate) {
		this.allocationEndDate = allocationEndDate;
	}
	
	
}
