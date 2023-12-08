package com.ocyt_backend.ocyt_backend.models;

import java.time.Instant;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class DisenoPresentado {
    @Id
    private String SOLICITUD_ANONIMIZADA;
    private Instant Ano_Presentacion;
    private String Dimension;
    private Instant Fecha_de_Presentacion;
    private String Inventor;
    private String Solicitante;
    private String Pais;
    private String Region;
    private String Ciudad;
    private Double Locarno;
    private String Residente;
    private String Pais_Nombre;

    public DisenoPresentado() {
    }

    public String getSOLICITUD_ANONIMIZADA() {
        return SOLICITUD_ANONIMIZADA;
    }

    public Instant getAno_Presentacion() {
        return Ano_Presentacion;
    }

    public void setAno_Presentacion(Instant ano_Presentacion) {
        this.Ano_Presentacion = ano_Presentacion;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String dimension) {
        this.Dimension = dimension;
    }

    public Instant getFecha_de_Presentacion() {
        return Fecha_de_Presentacion;
    }

    public void setFecha_de_Presentacion(Instant fecha_de_Presentacion) {
        this.Fecha_de_Presentacion = fecha_de_Presentacion;
    }

    public String getInventor() {
        return Inventor;
    }

    public void setInventor(String inventor) {
        this.Inventor = inventor;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.Solicitante = solicitante;
    }

     public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public Double getLocarno() {
        return Locarno;
    }

    public void setLocarno(Double locarno) {
        this.Locarno = locarno;
    }
    public String getResidente() {
        return Residente;
    }

    public void setResidente(String residente) {
        this.Residente = residente;
    }
    
    public String getPais_Nombre() {
        return Pais_Nombre;
    }

    public void setPais_Nombre(String pais_Nombre) {
        this.Pais_Nombre = pais_Nombre;
    }
}
