package entity;
// Generated 2017-9-25 0:32:35 by Hibernate Tools 5.2.3.Final

/**
 * DsNotice generated by hbm2java
 */
public class DsNotice implements java.io.Serializable {

	private Integer ntId;
	private int ntPublisherid;
	private int ntCollegeid;
	private String ntTime;
	private String ntContent;

	public DsNotice() {
	}

	public DsNotice(int ntPublisherid, int ntCollegeid, String ntTime, String ntContent) {
		this.ntPublisherid = ntPublisherid;
		this.ntCollegeid = ntCollegeid;
		this.ntTime = ntTime;
		this.ntContent = ntContent;
	}

	public Integer getNtId() {
		return this.ntId;
	}

	public void setNtId(Integer ntId) {
		this.ntId = ntId;
	}

	public int getNtPublisherid() {
		return this.ntPublisherid;
	}

	public void setNtPublisherid(int ntPublisherid) {
		this.ntPublisherid = ntPublisherid;
	}

	public int getNtCollegeid() {
		return this.ntCollegeid;
	}

	public void setNtCollegeid(int ntCollegeid) {
		this.ntCollegeid = ntCollegeid;
	}

	public String getNtTime() {
		return this.ntTime;
	}

	public void setNtTime(String ntTime) {
		this.ntTime = ntTime;
	}

	public String getNtContent() {
		return this.ntContent;
	}

	public void setNtContent(String ntContent) {
		this.ntContent = ntContent;
	}

}