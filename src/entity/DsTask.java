package entity;
// Generated 2017-10-14 23:08:04 by Hibernate Tools 5.2.3.Final



/**
 * DsTask generated by hbm2java
 */
public class DsTask  implements java.io.Serializable {


     private Integer tkId;
     private Integer tkCollegeid;
     private Integer tkMajorid;
     private Integer tkStudentid;
     private Integer tkTeacherid;
     private String tkLasttime;
     private String tkContent;
     private String tkState;
     private String trContent;
     private String trData;
     private String trRemark;

    public DsTask() {
    }

	
    public DsTask(int tkCollegeid, int tkMajorid, int tkStudentid, int tkTeacherid, String tkLasttime, String tkContent, String tkState) {
        this.tkCollegeid = tkCollegeid;
        this.tkMajorid = tkMajorid;
        this.tkStudentid = tkStudentid;
        this.tkTeacherid = tkTeacherid;
        this.tkLasttime = tkLasttime;
        this.tkContent = tkContent;
        this.tkState = tkState;
    }
    public DsTask(int tkCollegeid, int tkMajorid, int tkStudentid, int tkTeacherid, String tkLasttime, String tkContent, String tkState, String trContent, String trData, String trRemark) {
       this.tkCollegeid = tkCollegeid;
       this.tkMajorid = tkMajorid;
       this.tkStudentid = tkStudentid;
       this.tkTeacherid = tkTeacherid;
       this.tkLasttime = tkLasttime;
       this.tkContent = tkContent;
       this.tkState = tkState;
       this.trContent = trContent;
       this.trData = trData;
       this.trRemark = trRemark;
    }
   
    public Integer getTkId() {
        return this.tkId;
    }
    
    public void setTkId(Integer tkId) {
        this.tkId = tkId;
    }
    public int getTkCollegeid() {
        return this.tkCollegeid;
    }
    
    public void setTkCollegeid(int tkCollegeid) {
        this.tkCollegeid = tkCollegeid;
    }
    public int getTkMajorid() {
        return this.tkMajorid;
    }
    
    public void setTkMajorid(int tkMajorid) {
        this.tkMajorid = tkMajorid;
    }
    public int getTkStudentid() {
        return this.tkStudentid;
    }
    
    public void setTkStudentid(int tkStudentid) {
        this.tkStudentid = tkStudentid;
    }
    public int getTkTeacherid() {
        return this.tkTeacherid;
    }
    
    public void setTkTeacherid(int tkTeacherid) {
        this.tkTeacherid = tkTeacherid;
    }
    public String getTkLasttime() {
        return this.tkLasttime;
    }
    
    public void setTkLasttime(String tkLasttime) {
        this.tkLasttime = tkLasttime;
    }
    public String getTkContent() {
        return this.tkContent;
    }
    
    public void setTkContent(String tkContent) {
        this.tkContent = tkContent;
    }
    public String getTkState() {
        return this.tkState;
    }
    
    public void setTkState(String tkState) {
        this.tkState = tkState;
    }
    public String getTrContent() {
        return this.trContent;
    }
    
    public void setTrContent(String trContent) {
        this.trContent = trContent;
    }
    public String getTrData() {
        return this.trData;
    }
    
    public void setTrData(String trData) {
        this.trData = trData;
    }
    public String getTrRemark() {
        return this.trRemark;
    }
    
    public void setTrRemark(String trRemark) {
        this.trRemark = trRemark;
    }




}


