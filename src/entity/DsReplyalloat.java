package entity;
// Generated 2017-9-25 0:32:35 by Hibernate Tools 5.2.3.Final

/**
 * DsReplyalloat generated by hbm2java
 */
public class DsReplyalloat implements java.io.Serializable {

	private Integer raId;
	private int raCollegeid;
	private int raMajorid;
	private int raTeacherid;
	private int raStudentid;
	private String raTime;
	private String raPlace;

	public DsReplyalloat() {
	}

	public DsReplyalloat(int raCollegeid, int raMajorid, int raTeacherid, int raStudentid, String raTime,
			String raPlace) {
		this.raCollegeid = raCollegeid;
		this.raMajorid = raMajorid;
		this.raTeacherid = raTeacherid;
		this.raStudentid = raStudentid;
		this.raTime = raTime;
		this.raPlace = raPlace;
	}

	public Integer getRaId() {
		return this.raId;
	}

	public void setRaId(Integer raId) {
		this.raId = raId;
	}

	public int getRaCollegeid() {
		return this.raCollegeid;
	}

	public void setRaCollegeid(int raCollegeid) {
		this.raCollegeid = raCollegeid;
	}

	public int getRaMajorid() {
		return this.raMajorid;
	}

	public void setRaMajorid(int raMajorid) {
		this.raMajorid = raMajorid;
	}

	public int getRaTeacherid() {
		return this.raTeacherid;
	}

	public void setRaTeacherid(int raTeacherid) {
		this.raTeacherid = raTeacherid;
	}

	public int getRaStudentid() {
		return this.raStudentid;
	}

	public void setRaStudentid(int raStudentid) {
		this.raStudentid = raStudentid;
	}

	public String getRaTime() {
		return this.raTime;
	}

	public void setRaTime(String raTime) {
		this.raTime = raTime;
	}

	public String getRaPlace() {
		return this.raPlace;
	}

	public void setRaPlace(String raPlace) {
		this.raPlace = raPlace;
	}

}