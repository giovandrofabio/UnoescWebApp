package br.edu.unoesc.reflection;
import br.edu.unoesc.model.Produto;

public class Reflection3 {
    public static void main(String[] args) {
        Produto produto = new Produto(1,"Arroz","Alimento");

        Class<? extends Produto> classObj = produto.getClass();
        System.out.println(classObj.getName());
    }
}
