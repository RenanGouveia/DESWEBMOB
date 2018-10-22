package br.usjt.deswebmob.pipoca_mobile;


/**
 * Renan Gouveia
 * RA: 816114946
 */


import java.io.Serializable;
import java.text.Collator;

public class Filme implements Serializable, Comparable {

    private String nome;
    private String diretor;
    private String dtLancamento;
    private String genero;
    private Double popularidade;

    public Double getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(Double popularidade) {
        this.popularidade = popularidade;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(String dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public int compareTo(Object o) {

        if (o == null || o.getClass() != getClass()){
            return 0;
        } else {
            Filme filme = (Filme) o;
            Collator c = Collator.getInstance();

            c.setStrength(Collator.PRIMARY);

            return c.compare(this.nome, filme.getNome());
        }


    }

    @Override
    public String toString() {
        return "Filme{" +
                "Nome='" + nome + '\'' +
                ", Diretor='" + diretor + '\'' +
                ", Catalogo de Lançamento='" + dtLancamento + '\'' +
                ", Gênero='" + genero + '\'' +
                ", Popularidade='" + popularidade + '\'' +
                '}';
    }
}
