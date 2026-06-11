package model;
public class Plano {
 private String nome,tipo,cobertura; private double valor;
 public Plano(String nome,String tipo,String cobertura,double valor){this.nome=nome;this.tipo=tipo;this.cobertura=cobertura;this.valor=valor;}
 public String getNome(){return nome;} public double getValor(){return valor;}
}