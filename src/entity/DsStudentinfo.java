package entity;

import java.util.Set;

// Generated 2017-10-14 23:08:04 by Hibernate Tools 5.2.3.Final



/**
 * DsStudentinfo generated by hbm2java
 */
public class DsStudentinfo  implements java.io.Serializable {


     private Integer stId;
     private DsCollege college;
     private DsMajor major;
     private DsClass dsClass;
     private DsManagerinfo teacher;
     private DsPaper paper;
     private DsSubject subject;
     private DsReplyalloat reply;
     private DsPower power;
     private String stStuname;
     private String stUsername;
     private String stPassword;
     private String stTelnumber;
     private String stEmail;
     private Float stScore;
     private Set<DsTask> tasks;

    public DsStudentinfo() {
    }

	
   
   
    public Set<DsTask> getTasks() {
		return tasks;
	}




	public void setTasks(Set<DsTask> tasks) {
		this.tasks = tasks;
	}




	public DsCollege getCollege() {
		return college;
	}



	public void setCollege(DsCollege college) {
		this.college = college;
	}




	public DsMajor getMajor() {
		return major;
	}




	public void setMajor(DsMajor major) {
		this.major = major;
	}




	public DsClass getDsClass() {
		return dsClass;
	}




	public void setDsClass(DsClass dsClass) {
		this.dsClass = dsClass;
	}




	public DsManagerinfo getTeacher() {
		return teacher;
	}




	public void setTeacher(DsManagerinfo teacher) {
		this.teacher = teacher;
	}




	public DsPaper getPaper() {
		return paper;
	}




	public void setPaper(DsPaper paper) {
		this.paper = paper;
	}




	public DsSubject getSubject() {
		return subject;
	}




	public void setSubject(DsSubject subject) {
		this.subject = subject;
	}




	public DsReplyalloat getReply() {
		return reply;
	}




	public void setReply(DsReplyalloat reply) {
		this.reply = reply;
	}




	public DsPower getPower() {
		return power;
	}




	public void setPower(DsPower power) {
		this.power = power;
	}




	public Integer getStId() {
        return this.stId;
    }
    
    public void setStId(Integer stId) {
        this.stId = stId;
    }
    public String getStStuname() {
        return this.stStuname;
    }
    
    public void setStStuname(String stStuname) {
        this.stStuname = stStuname;
    }
    public String getStUsername() {
        return this.stUsername;
    }
    
    public void setStUsername(String stUsername) {
        this.stUsername = stUsername;
    }
    public String getStPassword() {
        return this.stPassword;
    }
    
    public void setStPassword(String stPassword) {
        this.stPassword = stPassword;
    }
    public String getStTelnumber() {
        return this.stTelnumber;
    }
    
    public void setStTelnumber(String stTelnumber) {
        this.stTelnumber = stTelnumber;
    }
    public String getStEmail() {
        return this.stEmail;
    }
    
    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }
    public Float getStScore() {
        return this.stScore;
    }
    
    public void setStScore(Float stScore) {
        this.stScore = stScore;
    }




}


