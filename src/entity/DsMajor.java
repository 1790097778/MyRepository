package entity;
// Generated 2017-9-25 0:32:35 by Hibernate Tools 5.2.3.Final

/**
 * DsMajor generated by hbm2java
 */
public class DsMajor implements java.io.Serializable {

	private Integer mjId;
	private Integer mjCollegeid;
	private String mjName;

	public DsMajor() {
	}

	public DsMajor(Integer mjCollegeid, String mjName) {
		this.mjCollegeid = mjCollegeid;
		this.mjName = mjName;
	}

	public Integer getMjId() {
		return this.mjId;
	}

	public void setMjId(Integer mjId) {
		this.mjId = mjId;
	}

	public Integer getMjCollegeid() {
		return this.mjCollegeid;
	}

	public void setMjCollegeid(Integer mjCollegeid) {
		this.mjCollegeid = mjCollegeid;
	}

	public String getMjName() {
		return this.mjName;
	}

	public void setMjName(String mjName) {
		this.mjName = mjName;
	}

}