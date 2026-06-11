package model;
public abstract class ProfissionalSaude extends Pessoa{
 private String especialidade,crmOuRegistro; private boolean ativo=true;
 public ProfissionalSaude(int id,String nome,String email,String telefone,String especialidade,String crmOuRegistro){
 super(id,nome,email,telefone); this.especialidade=especialidade; this.crmOuRegistro=crmOuRegistro;}
 public abstract String obterDescricaoProfissional();
 public abstract boolean validarCredenciais();
 public String getEspecialidade(){return especialidade;} public String getCrmOuRegistro(){return crmOuRegistro;} public boolean isAtivo(){return ativo;}
}