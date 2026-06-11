package model;
public class Paciente extends Pessoa{
 private final String cpf; private final Plano plano;
 public Paciente(int id,String nome,String email,String telefone,String cpf,Plano plano){super(id,nome,email,telefone);this.cpf=cpf;this.plano=plano;}
 public String getCpf(){return cpf;} public Plano getPlano(){return plano;}
}