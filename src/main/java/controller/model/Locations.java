package controller.model;
// Generated Nov 12, 2019 7:41:14 AM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Locations generated by hbm2java
 */
@Entity
@Table(name = "LOCATIONS", schema = "HR")
public class Locations implements java.io.Serializable {

	private short locationId;
	private Countries countries;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private Set<Departments> departmentses = new HashSet<Departments>(0);

	public Locations() {
	}

	public Locations(short locationId, String city) {
		this.locationId = locationId;
		this.city = city;
	}

	public Locations(short locationId, Countries countries, String streetAddress, String postalCode, String city,
			String stateProvince, Set<Departments> departmentses) {
		this.locationId = locationId;
		this.countries = countries;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.departmentses = departmentses;
	}

	@Id

	@Column(name = "LOCATION_ID", unique = true, nullable = false, precision = 4, scale = 0)
	public short getLocationId() {
		return this.locationId;
	}

	public void setLocationId(short locationId) {
		this.locationId = locationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID")
	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Column(name = "STREET_ADDRESS", length = 40)
	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@Column(name = "POSTAL_CODE", length = 12)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "CITY", nullable = false, length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STATE_PROVINCE", length = 25)
	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locations")
	public Set<Departments> getDepartmentses() {
		return this.departmentses;
	}

	public void setDepartmentses(Set<Departments> departmentses) {
		this.departmentses = departmentses;
	}

}
