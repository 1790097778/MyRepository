package entity;
// Generated 2017-9-25 0:32:35 by Hibernate Tools 5.2.3.Final

/**
 * DsPaper generated by hbm2java
 */
public class DsPaper implements java.io.Serializable {

	private Integer ppId;
	private int ppStudentid;
	private int ppCollegeid;
	private int ppMajorid;
	private int ppClassid;
	private int ppTeacherid;
	private int ppJudgerid;
	private int ppReplyid;
	private String ppTeacheradvice;
	private String ppContent;
	private String ppState;
	private double rpContentscore;
	private double rpReportscore;
	private double rpInnovatescore;
	private double rpReplyscore;
	private double rpReplyremark;
	private double rpDefenseremark;
	private String rpRecordlist;
	private double rpTotalscore;
	private float jfJudgerscores;
	private float jfScores1;
	private float jfScores2;
	private float jfScores3;
	private float jfScores4;
	private float jfScores5;
	private float jfScores6;
	private String jfJudgerremark;
	private float tfTeacherscores;
	private float tfScores1;
	private float tfScores2;
	private float tfScores3;
	private float tfScores4;
	private float tfScores5;
	private float tfScores6;
	private String tfTeacherremark;

	public DsPaper() {
	}

	public DsPaper(int ppStudentid, int ppCollegeid, int ppMajorid, int ppClassid, int ppTeacherid, int ppJudgerid,
			int ppReplyid, String ppTeacheradvice, String ppContent, String ppState, double rpContentscore,
			double rpReportscore, double rpInnovatescore, double rpReplyscore, double rpReplyremark,
			double rpDefenseremark, String rpRecordlist, double rpTotalscore, float jfJudgerscores, float jfScores1,
			float jfScores2, float jfScores3, float jfScores4, float jfScores5, float jfScores6, String jfJudgerremark,
			float tfTeacherscores, float tfScores1, float tfScores2, float tfScores3, float tfScores4, float tfScores5,
			float tfScores6, String tfTeacherremark) {
		this.ppStudentid = ppStudentid;
		this.ppCollegeid = ppCollegeid;
		this.ppMajorid = ppMajorid;
		this.ppClassid = ppClassid;
		this.ppTeacherid = ppTeacherid;
		this.ppJudgerid = ppJudgerid;
		this.ppReplyid = ppReplyid;
		this.ppTeacheradvice = ppTeacheradvice;
		this.ppContent = ppContent;
		this.ppState = ppState;
		this.rpContentscore = rpContentscore;
		this.rpReportscore = rpReportscore;
		this.rpInnovatescore = rpInnovatescore;
		this.rpReplyscore = rpReplyscore;
		this.rpReplyremark = rpReplyremark;
		this.rpDefenseremark = rpDefenseremark;
		this.rpRecordlist = rpRecordlist;
		this.rpTotalscore = rpTotalscore;
		this.jfJudgerscores = jfJudgerscores;
		this.jfScores1 = jfScores1;
		this.jfScores2 = jfScores2;
		this.jfScores3 = jfScores3;
		this.jfScores4 = jfScores4;
		this.jfScores5 = jfScores5;
		this.jfScores6 = jfScores6;
		this.jfJudgerremark = jfJudgerremark;
		this.tfTeacherscores = tfTeacherscores;
		this.tfScores1 = tfScores1;
		this.tfScores2 = tfScores2;
		this.tfScores3 = tfScores3;
		this.tfScores4 = tfScores4;
		this.tfScores5 = tfScores5;
		this.tfScores6 = tfScores6;
		this.tfTeacherremark = tfTeacherremark;
	}

	public Integer getPpId() {
		return this.ppId;
	}

	public void setPpId(Integer ppId) {
		this.ppId = ppId;
	}

	public int getPpStudentid() {
		return this.ppStudentid;
	}

	public void setPpStudentid(int ppStudentid) {
		this.ppStudentid = ppStudentid;
	}

	public int getPpCollegeid() {
		return this.ppCollegeid;
	}

	public void setPpCollegeid(int ppCollegeid) {
		this.ppCollegeid = ppCollegeid;
	}

	public int getPpMajorid() {
		return this.ppMajorid;
	}

	public void setPpMajorid(int ppMajorid) {
		this.ppMajorid = ppMajorid;
	}

	public int getPpClassid() {
		return this.ppClassid;
	}

	public void setPpClassid(int ppClassid) {
		this.ppClassid = ppClassid;
	}

	public int getPpTeacherid() {
		return this.ppTeacherid;
	}

	public void setPpTeacherid(int ppTeacherid) {
		this.ppTeacherid = ppTeacherid;
	}

	public int getPpJudgerid() {
		return this.ppJudgerid;
	}

	public void setPpJudgerid(int ppJudgerid) {
		this.ppJudgerid = ppJudgerid;
	}

	public int getPpReplyid() {
		return this.ppReplyid;
	}

	public void setPpReplyid(int ppReplyid) {
		this.ppReplyid = ppReplyid;
	}

	public String getPpTeacheradvice() {
		return this.ppTeacheradvice;
	}

	public void setPpTeacheradvice(String ppTeacheradvice) {
		this.ppTeacheradvice = ppTeacheradvice;
	}

	public String getPpContent() {
		return this.ppContent;
	}

	public void setPpContent(String ppContent) {
		this.ppContent = ppContent;
	}

	public String getPpState() {
		return this.ppState;
	}

	public void setPpState(String ppState) {
		this.ppState = ppState;
	}

	public double getRpContentscore() {
		return this.rpContentscore;
	}

	public void setRpContentscore(double rpContentscore) {
		this.rpContentscore = rpContentscore;
	}

	public double getRpReportscore() {
		return this.rpReportscore;
	}

	public void setRpReportscore(double rpReportscore) {
		this.rpReportscore = rpReportscore;
	}

	public double getRpInnovatescore() {
		return this.rpInnovatescore;
	}

	public void setRpInnovatescore(double rpInnovatescore) {
		this.rpInnovatescore = rpInnovatescore;
	}

	public double getRpReplyscore() {
		return this.rpReplyscore;
	}

	public void setRpReplyscore(double rpReplyscore) {
		this.rpReplyscore = rpReplyscore;
	}

	public double getRpReplyremark() {
		return this.rpReplyremark;
	}

	public void setRpReplyremark(double rpReplyremark) {
		this.rpReplyremark = rpReplyremark;
	}

	public double getRpDefenseremark() {
		return this.rpDefenseremark;
	}

	public void setRpDefenseremark(double rpDefenseremark) {
		this.rpDefenseremark = rpDefenseremark;
	}

	public String getRpRecordlist() {
		return this.rpRecordlist;
	}

	public void setRpRecordlist(String rpRecordlist) {
		this.rpRecordlist = rpRecordlist;
	}

	public double getRpTotalscore() {
		return this.rpTotalscore;
	}

	public void setRpTotalscore(double rpTotalscore) {
		this.rpTotalscore = rpTotalscore;
	}

	public float getJfJudgerscores() {
		return this.jfJudgerscores;
	}

	public void setJfJudgerscores(float jfJudgerscores) {
		this.jfJudgerscores = jfJudgerscores;
	}

	public float getJfScores1() {
		return this.jfScores1;
	}

	public void setJfScores1(float jfScores1) {
		this.jfScores1 = jfScores1;
	}

	public float getJfScores2() {
		return this.jfScores2;
	}

	public void setJfScores2(float jfScores2) {
		this.jfScores2 = jfScores2;
	}

	public float getJfScores3() {
		return this.jfScores3;
	}

	public void setJfScores3(float jfScores3) {
		this.jfScores3 = jfScores3;
	}

	public float getJfScores4() {
		return this.jfScores4;
	}

	public void setJfScores4(float jfScores4) {
		this.jfScores4 = jfScores4;
	}

	public float getJfScores5() {
		return this.jfScores5;
	}

	public void setJfScores5(float jfScores5) {
		this.jfScores5 = jfScores5;
	}

	public float getJfScores6() {
		return this.jfScores6;
	}

	public void setJfScores6(float jfScores6) {
		this.jfScores6 = jfScores6;
	}

	public String getJfJudgerremark() {
		return this.jfJudgerremark;
	}

	public void setJfJudgerremark(String jfJudgerremark) {
		this.jfJudgerremark = jfJudgerremark;
	}

	public float getTfTeacherscores() {
		return this.tfTeacherscores;
	}

	public void setTfTeacherscores(float tfTeacherscores) {
		this.tfTeacherscores = tfTeacherscores;
	}

	public float getTfScores1() {
		return this.tfScores1;
	}

	public void setTfScores1(float tfScores1) {
		this.tfScores1 = tfScores1;
	}

	public float getTfScores2() {
		return this.tfScores2;
	}

	public void setTfScores2(float tfScores2) {
		this.tfScores2 = tfScores2;
	}

	public float getTfScores3() {
		return this.tfScores3;
	}

	public void setTfScores3(float tfScores3) {
		this.tfScores3 = tfScores3;
	}

	public float getTfScores4() {
		return this.tfScores4;
	}

	public void setTfScores4(float tfScores4) {
		this.tfScores4 = tfScores4;
	}

	public float getTfScores5() {
		return this.tfScores5;
	}

	public void setTfScores5(float tfScores5) {
		this.tfScores5 = tfScores5;
	}

	public float getTfScores6() {
		return this.tfScores6;
	}

	public void setTfScores6(float tfScores6) {
		this.tfScores6 = tfScores6;
	}

	public String getTfTeacherremark() {
		return this.tfTeacherremark;
	}

	public void setTfTeacherremark(String tfTeacherremark) {
		this.tfTeacherremark = tfTeacherremark;
	}

}
