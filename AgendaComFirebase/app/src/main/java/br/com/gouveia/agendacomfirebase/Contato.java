package br.com.gouveia.agendacomfirebase;

public class Contato {

    private String email;
    private String nome;
    private String fone;
    private String id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String telefone) {
        this.fone = fone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Contato (String id, String nome, String fone, String email){
        this (nome, fone, email);
        setId(id);
    }
    public Contato (String nome, String fone, String email){
        setNome(nome);
        setFone(fone);
        setEmail(email);
    }
    public Contato (){
    }
}
