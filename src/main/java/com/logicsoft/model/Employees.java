package com.logicsoft.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employees
{
@Id
@Column
private int employeeid;
@Column
private String employeename;
@Column
private String projectassociated;

@Column
private int projectresources;
@Column
private String status;
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getProjectassociated() {
	return projectassociated;
}
public void setProjectassociated(String projectassociated) {
	this.projectassociated = projectassociated;
}
public int getProjectresources() {
	return projectresources;
}
public void setProjectresources(int projectresources) {
	this.projectresources = projectresources;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}