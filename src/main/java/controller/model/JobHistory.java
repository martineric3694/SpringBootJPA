package controller.model;
// Generated Nov 12, 2019 7:41:14 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JobHistory generated by hbm2java
 */
@Entity
@Table(name = "JOB_HISTORY", schema = "HR")
public class JobHistory implements java.io.Serializable {

	private JobHistoryId id;
	private Departments departments;
	private Jobs jobs;
	private Employees employees;
	private Date endDate;

	public JobHistory() {
	}

	public JobHistory(JobHistoryId id, Jobs jobs, Employees employees, Date endDate) {
		this.id = id;
		this.jobs = jobs;
		this.employees = employees;
		this.endDate = endDate;
	}

	public JobHistory(JobHistoryId id, Departments departments, Jobs jobs, Employees employees, Date endDate) {
		this.id = id;
		this.departments = departments;
		this.jobs = jobs;
		this.employees = employees;
		this.endDate = endDate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "employeeId", column = @Column(name = "EMPLOYEE_ID", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "startDate", column = @Column(name = "START_DATE", nullable = false, length = 7)) })
	public JobHistoryId getId() {
		return this.id;
	}

	public void setId(JobHistoryId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTMENT_ID")
	public Departments getDepartments() {
		return this.departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_ID", nullable = false)
	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE", nullable = false, length = 7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
