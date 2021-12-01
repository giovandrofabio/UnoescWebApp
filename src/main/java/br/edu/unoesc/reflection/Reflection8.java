package br.edu.unoesc.reflection;

import br.edu.unoesc.model.Produto;

import java.lang.reflect.Method;

public class Reflection8 {
    public static void main(String[] args) {
        try {
            Class<Produto> classObj = Produto.class;
            Object produtoobject = classObj.newInstance();

            Method method = classObj.getDeclaredMethod("MostrarProduto", new Class[]{ String.class});
            method.setAccessible(true);
            method.invoke(produtoobject, "Giovandro");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
