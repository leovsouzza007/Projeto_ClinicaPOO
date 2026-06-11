package model;
public class Medico extends ProfissionalSaude{
 private String areaAtuacao;
 public Medico(int id,String nome,String email,String telefone,String especialidade,String crm,String areaAtuacao){
 super(id,nome,email,telefone,especialidade,crm); this.areaAtuacao=areaAtuacao;}
 public String obterDescricaoProfissional(){return "Medico "+getNome();}
 public boolean validarCredenciais(){return getCrmOuRegistro()!=null;}
}