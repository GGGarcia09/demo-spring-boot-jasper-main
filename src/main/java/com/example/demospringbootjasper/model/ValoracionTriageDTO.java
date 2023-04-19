package com.example.demospringbootjasper.model;



public class ValoracionTriageDTO {

    public  Integer id;
    public  String pais;
    public String entidad;
    public String riss;
    public  String municipio;
    public String localidad;
    public  String jurisdiccion;
    public String tipoExp;
    public String nivelAten;

    public String hospital;
    public String direccion;
    public String contacto;

    public String nombreFormato;
    public String idPaciente;
    public String idExp;

    public ValoracionTriageDTO(Integer id, String pais, String entidad, String riss, String municipio, String localidad, String jurisdiccion, String tipoExp, String nivelAten, String hospital, String direccion, String contacto, String nombreFormato, String idPaciente, String idExp) {
        this.id = id;
        this.pais = pais;
        this.entidad = entidad;
        this.riss = riss;
        this.municipio = municipio;
        this.localidad = localidad;
        this.jurisdiccion = jurisdiccion;
        this.tipoExp = tipoExp;
        this.nivelAten = nivelAten;
        this.hospital = hospital;
        this.direccion = direccion;
        this.contacto = contacto;
        this.nombreFormato = nombreFormato;
        this.idPaciente = idPaciente;
        this.idExp = idExp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getRiss() {
        return riss;
    }

    public void setRiss(String riss) {
        this.riss = riss;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public String getTipoExp() {
        return tipoExp;
    }

    public void setTipoExp(String tipoExp) {
        this.tipoExp = tipoExp;
    }

    public String getNivelAten() {
        return nivelAten;
    }

    public void setNivelAten(String nivelAten) {
        this.nivelAten = nivelAten;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNombreFormato() {
        return nombreFormato;
    }

    public void setNombreFormato(String nombreFormato) {
        this.nombreFormato = nombreFormato;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdExp() {
        return idExp;
    }

    public void setIdExp(String idExp) {
        this.idExp = idExp;
    }
}
