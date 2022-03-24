package com.senai.pi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Escolher a Persistence	
@Entity
public class Evento implements Serializable{

private static final long serialVersionUID=1L;

//Escolher a Persistence	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long codigo;
private String produto;
private String cor;
private String lote;
private String fabricacao;


public long getCodigo() {
	return codigo;
}
public void setCodigo(long codigo) {
	this.codigo = codigo;
}
public String getProduto() {
	return produto;
}
public void setProduto(String produto) {
	this.produto = produto;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getLote() {
	return lote;
}
public void setLote(String lote) {
	this.lote = lote;
}
public String getFabricacao() {
	return fabricacao;
}
public void setFabricacao(String fabricacao) {
	this.fabricacao = fabricacao;
}


}
