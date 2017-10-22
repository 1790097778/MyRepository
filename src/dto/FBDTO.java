package dto;

import java.util.Map;

/*
 *DTO used between foreground and backstage 
  */
public class FBDTO {
	private int success; // 1:success 0:error
	private String errorMsg; // errorMsg will be "success" if success is 1
	private Map data;

	// if there is error ,use this constructor
	public FBDTO(int success, String errorMsg, Map data) {
		this.success = success;
		this.errorMsg = errorMsg;
		this.data = data;
	}

	// if there is no error,use this constructor
	public FBDTO(Map data) {
		this.success = 1;
		this.errorMsg = "success";
		this.data = data;
	}

	public FBDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getSuccess() {
		return success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Map getData() {
		return data;
	}

}
