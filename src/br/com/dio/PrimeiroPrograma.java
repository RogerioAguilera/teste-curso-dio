package br.com.dio;

import br.com.dio.model.Leao;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Leao leao = new Leao();

        System.out.println(leao);

        Livro livro1 = new Livro ("O hobbit", 520);
        System.out.println(livro1);

    }
}
class Livro{
    private String name;

    public Livro(String o_hobbit, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    private Integer numPaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}