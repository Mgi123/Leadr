package in.leadr.leadrapplication.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lead_data")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String address;
	private String mobile;
	private String source;
	private String owner;
	private String currentowner;
	private String status;
	private String education;
	private String experience;
	private int salary;
	private int companyId;
	private Timestamp creationDate;

	public Lead() {

	}

	public Lead(int id, String name, String email, String address, String mobile, String source, String owner,
			String currentowner, String status, String education, String experience, int salary, int companyId,
			Timestamp creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.source = source;
		this.owner = owner;
		this.currentowner = currentowner;
		this.status = status;
		this.education = education;
		this.experience = experience;
		this.salary = salary;
		this.companyId = companyId;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCurrentowner() {
		return currentowner;
	}

	public void setCurrentowner(String currentowner) {
		this.currentowner = currentowner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobile=" + mobile
				+ ", source=" + source + ", owner=" + owner + ", currentowner=" + currentowner + ", status=" + status
				+ ", education=" + education + ", experience=" + experience + ", salary=" + salary + ", companyId="
				+ companyId + ", creationDate=" + creationDate + "]";
	}

}
