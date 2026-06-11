package model;
public abstract class Pessoa {
    private final int id; private final String nome,email,telefone;
    public Pessoa(int id,String nome,String email,String telefone){this.id=id;this.nome=nome;this.email=email;this.telefone=telefone;}
    public int getId(){return id;} public String getNome(){return nome;} public String getEmail(){return email;} public String getTelefone(){return telefone;}
}