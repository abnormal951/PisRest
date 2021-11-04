package com.hitss.pis.rest.webservices.bean;

/**
 * 
 * @author sanchezd
 *
 */
public class BAPIRETURN1Bean {
	private String type;
    private String id;
    private String number;
    private String message;
    private String logno;
    private String logmsgno;
    private String messagev1;
    private String messagev2;
    private String messagev3;
    private String messagev4;
    
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLogno() {
		return logno;
	}
	public void setLogno(String logno) {
		this.logno = logno;
	}
	public String getLogmsgno() {
		return logmsgno;
	}
	public void setLogmsgno(String logmsgno) {
		this.logmsgno = logmsgno;
	}
	public String getMessagev1() {
		return messagev1;
	}
	public void setMessagev1(String messagev1) {
		this.messagev1 = messagev1;
	}
	public String getMessagev2() {
		return messagev2;
	}
	public void setMessagev2(String messagev2) {
		this.messagev2 = messagev2;
	}
	public String getMessagev3() {
		return messagev3;
	}
	public void setMessagev3(String messagev3) {
		this.messagev3 = messagev3;
	}
	public String getMessagev4() {
		return messagev4;
	}
	public void setMessagev4(String messagev4) {
		this.messagev4 = messagev4;
	}
	@Override
	public String toString() {
		return "BAPIRETURN1Bean [type=" + type + ", id=" + id + ", number=" + number + ", message=" + message
				+ ", logno=" + logno + ", logmsgno=" + logmsgno + ", messagev1=" + messagev1 + ", messagev2="
				+ messagev2 + ", messagev3=" + messagev3 + ", messagev4=" + messagev4 + "]";
	}
}
