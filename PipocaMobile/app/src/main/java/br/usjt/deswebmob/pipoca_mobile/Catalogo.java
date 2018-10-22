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
        filme.setPopularidade(10.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(1.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(20.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(30.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(50.6);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(62.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-09-06");
        filme.setGenero("Ação");
        filme.setPopularidade(62.8);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(100.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(6.2);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(61.4);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(55.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(93.4);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(4.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Aventura");
        filme.setPopularidade(63.78);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(41.2);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(32.0);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(36.1);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(4.7);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(68.52);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(63.41);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Romance");
        filme.setPopularidade(57.2);
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(42.63);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(69.8);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(41.3);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(12.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(92.3);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(63.4);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Terror");
        filme.setPopularidade(10.4);
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 1");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(65.4);
        filmes.add(filme);


        filme = new Filme();
        filme.setNome("Nome Teste 2");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(78.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 3");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(98.8);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 4");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(64.7);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 5");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(50.3);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 6");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(71.5);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Nome Teste 7");
        filme.setDiretor("Diretor Teste");
        filme.setDtLancamento("2018-10-03");
        filme.setGenero("Comédia");
        filme.setPopularidade(82.4);
        filmes.add(filme);


        return filmes;

    }
}
