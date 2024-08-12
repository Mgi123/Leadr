package in.leadr.leadrapplication.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comment_data")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int leadid;
	private int userid;
	private int companyId;
	private String useremail;
	private String comment;
	private Timestamp creationDate;
	private Timestamp updationDate;

	public Comment() {

	}

	public Comment(int id, int leadid, int userid, int companyId, String useremail, String comment,
			Timestamp creationDate, Timestamp updationDate) {
		super();
		this.id = id;
		this.leadid = leadid;
		this.userid = userid;
		this.companyId = companyId;
		this.useremail = useremail;
		this.comment = comment;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLeadid() {
		return leadid;
	}

	public void setLeadid(int leadid) {
		this.leadid = leadid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", leadid=" + leadid + ", userid=" + userid + ", companyId=" + companyId
				+ ", useremail=" + useremail + ", comment=" + comment + ", creationDate=" + creationDate
				+ ", updationDate=" + updationDate + "]";
	}

}
