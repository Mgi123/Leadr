package in.leadr.leadrapplication.model;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdata")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String gender;
	private String mobile;
	private String isAdmin;
	private int companyId;
	private byte[] image ;
	
	
	
	public User() {
		
	}
	public User(Integer id, String username, String password, String name, String email, String gender, String mobile,
			String isAdmin, int companyId, byte[] image) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
		this.isAdmin = isAdmin;
		this.companyId = companyId;
		this.image = image;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", email="
				+ email + ", gender=" + gender + ", mobile=" + mobile + ", isAdmin=" + isAdmin + ", companyId="
				+ companyId + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	

}
