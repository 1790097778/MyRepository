package entity;
// Generated 2017-9-25 0:32:35 by Hibernate Tools 5.2.3.Final

/**
 * DsClass generated by hbm2java
 */
public class DsClass implements java.io.Serializable {

	private Integer csId;
	private Integer csCollegeid;
	private Integer csMajorid;
	private String csName;

	public DsClass() {
	}

	public DsClass(Integer csCollegeid, Integer csMajorid, String csName) {
		this.csCollegeid = csCollegeid;
		this.csMajorid = csMajorid;
		this.csName = csName;
	}

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public Integer getCsCollegeid() {
		return this.csCollegeid;
	}

	public void setCsCollegeid(Integer csCollegeid) {
		this.csCollegeid = csCollegeid;
	}

	public Integer getCsMajorid() {
		return this.csMajorid;
	}

	public void setCsMajorid(Integer csMajorid) {
		this.csMajorid = csMajorid;
	}

	public String getCsName() {
		return this.csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

}
