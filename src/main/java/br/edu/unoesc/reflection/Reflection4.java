package br.edu.unoesc.reflection;
import br.edu.unoesc.model.Produto;

public class Reflection4 {
    public static void main(String[] args) {

        Class<Produto> produtoClassObj = Produto.class;
        System.out.println(produtoClassObj.getName());

        Class<Integer> intClassObj = int.class;
        System.out.println(intClassObj.getName());
    }
}
