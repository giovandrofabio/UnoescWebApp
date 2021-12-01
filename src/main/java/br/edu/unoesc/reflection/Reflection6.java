package br.edu.unoesc.reflection;

import br.edu.unoesc.model.Produto;

public class Reflection6 {
    public static void main(String[] args) {
        try {
            Class<?> classObjt = Class.forName("br.edu.unoesc.model.Produto");

            Produto produto = (Produto) classObjt.newInstance();
            produto.Teste();
        }catch(InstantiationException | IllegalAccessException
                | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
