package com.ocyt_backend.ocyt_backend.models;

import java.time.Instant;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class DisenoConcedido {
    @Id
    private Integer SOLICITUD;
    private Instant Ano_de_Concesion;
    private String Dimension;
    private String Titulo;
    private Instant Fecha_de_Concesion;
    private String Inventor;
    private String Solicitante;
    private String Pais;
    private String Region;
    private String Ciudad;
    private Double Locarno;
    private String Residente;
    private String Pais_Nombre;

    public DisenoConcedido() {
    }

    public Integer getSOLICITUD() {
        return SOLICITUD;
    }

    public Instant getAno_de_Concesion() {
        return Ano_de_Concesion;
    }

    public void setAno_de_Concesion(Instant Ano_de_Concesion) {
        this.Ano_de_Concesion = Ano_de_Concesion;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String dimension) {
        this.Dimension = dimension;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Instant getFecha_de_Concesion() {
        return Fecha_de_Concesion;
    }

    public void setFecha_de_Concesion(Instant fecha_de_Concesion) {
        this.Fecha_de_Concesion = fecha_de_Concesion;
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
