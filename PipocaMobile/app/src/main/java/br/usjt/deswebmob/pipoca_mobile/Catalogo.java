package br.usjt.deswebmob.pipoca_mobile;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Renan Gouveia
 * RA: 816114946
 */

public class Catalogo {


    public static ArrayList<String> listarNomes(ArrayList<Filme> filmes){
        ArrayList<String> nomes = new ArrayList<>();
        for (Filme filme : filmes) {
            nomes.add(filme.getNome());
        }
        return nomes;
    }
    public static ArrayList<Filme> listarFilmes(String genero) {
        Filme[] lista;
        ArrayList<Filme> filmes = new ArrayList<>();
        //carrega somente os paises da regiao escolhida
        for (Filme filme : todosFilmes()) {
            if (filme.getGenero().equals(genero) || genero.equals("Todos")) {
                filmes.add(filme);
            }
        }
        //converte para vetor para poder ordenar usando o sort da classe Arrays
        lista = filmes.toArray(new Filme[0]);
        //ordena baseado no compareTo sobrescrito na classe Pais
        //para funcionar, a classe pais precisa implementar a interface Comparable
        Arrays.sort(lista);
        //transforma de novo em ArrayList
        filmes = new ArrayList<>();
        for(int i = 0; i < lista.length; i++) {
            filmes.add(lista[i]);
        }
        return filmes;
    }

    private static ArrayList<Filme> todosFilmes() {
        ArrayList<Filme> filmes = new ArrayList<>();
        Filme filme;
        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filmes.add(filme);


        return filmes;

    }
}
