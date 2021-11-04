package com.hitss.pis.rest.webservices.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaRequestDTO {
	@JsonProperty("resp")
	private String resp;

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}
}
