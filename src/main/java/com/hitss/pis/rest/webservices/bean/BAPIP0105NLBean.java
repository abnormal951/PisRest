package com.hitss.pis.rest.webservices.bean;

/**
 * 
 * @author sanchezd
 *
 */
public class BAPIP0105NLBean {

	private String employeeno;
    private String subtype;
    private String objectid;
    private String lockindic;
    private String validend;
    private String validbegin;
    private String recordnr;
    private String commtype;
    private String nameofcommtype;
    private String id;
    private String delimitdate;
    
	public String getEmployeeno() {
		return employeeno;
	}
	public void setEmployeeno(String employeeno) {
		this.employeeno = employeeno;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getObjectid() {
		return objectid;
	}
	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}
	public String getLockindic() {
		return lockindic;
	}
	public void setLockindic(String lockindic) {
		this.lockindic = lockindic;
	}
	public String getValidend() {
		return validend;
	}
	public void setValidend(String validend) {
		this.validend = validend;
	}
	public String getValidbegin() {
		return validbegin;
	}
	public void setValidbegin(String validbegin) {
		this.validbegin = validbegin;
	}
	public String getRecordnr() {
		return recordnr;
	}
	public void setRecordnr(String recordnr) {
		this.recordnr = recordnr;
	}
	public String getCommtype() {
		return commtype;
	}
	public void setCommtype(String commtype) {
		this.commtype = commtype;
	}
	public String getNameofcommtype() {
		return nameofcommtype;
	}
	public void setNameofcommtype(String nameofcommtype) {
		this.nameofcommtype = nameofcommtype;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDelimitdate() {
		return delimitdate;
	}
	public void setDelimitdate(String delimitdate) {
		this.delimitdate = delimitdate;
	}
	@Override
	public String toString() {
		return "BAPIP0105NLBean [employeeno=" + employeeno + ", subtype=" + subtype + ", objectid=" + objectid
				+ ", lockindic=" + lockindic + ", validend=" + validend + ", validbegin=" + validbegin + ", recordnr="
				+ recordnr + ", commtype=" + commtype + ", nameofcommtype=" + nameofcommtype + ", id=" + id
				+ ", delimitdate=" + delimitdate + "]";
	}

}
