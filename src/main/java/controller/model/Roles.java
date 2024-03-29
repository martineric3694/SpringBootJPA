package controller.model;
// Generated Nov 12, 2019 7:41:14 AM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name = "ROLES", schema = "HR")
public class Roles implements java.io.Serializable {

	private int roleId;
	private String role;
	private Set<Users> userses = new HashSet<Users>(0);

	public Roles() {
	}

	public Roles(int roleId) {
		this.roleId = roleId;
	}

	public Roles(int roleId, String role, Set<Users> userses) {
		this.roleId = roleId;
		this.role = role;
		this.userses = userses;
	}

	@Id

	@Column(name = "ROLE_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "ROLE", length = 20)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}
