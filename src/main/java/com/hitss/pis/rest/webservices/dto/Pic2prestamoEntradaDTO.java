package com.hitss.pis.rest.webservices.dto;

import java.util.List;

import com.hitss.pis.rest.webservices.bo.pic2prestamo.PIC2PrestamoEntradaBO;

public class Pic2prestamoEntradaDTO {

	private String expSolicita;
	private String fechaRef;
	private String idMovimiento;
	private List<PIC2PrestamoEntradaBO> listEntradaBO;

	public String getExpSolicita() {
		return expSolicita;
	}

	public void setExpSolicita(String expSolicita) {
		this.expSolicita = expSolicita;
	}

	public String getFechaRef() {
		return fechaRef;
	}

	public void setFechaRef(String fechaRef) {
		this.fechaRef = fechaRef;
	}

	public String getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(String idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public List<PIC2PrestamoEntradaBO> getListEntradaBO() {
		return listEntradaBO;
	}

	public void setListEntradaBO(List<PIC2PrestamoEntradaBO> listEntradaBO) {
		this.listEntradaBO = listEntradaBO;
	}

	@Override
	public String toString() {
		return "Pic2prestamoEntradaDTO [expSolicita=" + expSolicita + ", fechaRef=" + fechaRef + ", idMovimiento="
				+ idMovimiento + ", listEntradaBO=" + listEntradaBO + "]";
	}

}
