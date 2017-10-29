package dto;

import java.util.Map;

public class Dto {
	private int success;
	private String errorMsg;
	private Map data;
	public Dto(int success, String errorMsg, Map map) {
		super();
		this.success = success;
		this.errorMsg = errorMsg;
		this.data = map;
	}
	public Dto(Map map)
	{
		super();
		this.success = 1;
		this.errorMsg = "success";
		this.data = map;
	}
	public int getSuccess() {
		return success;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Map getData() {
		return data;
	}
	public void setData(Map map) {
		this.data = map;
	}
	
	
}
