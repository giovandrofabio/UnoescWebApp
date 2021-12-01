package br.edu.unoesc.reflection;
import br.edu.unoesc.model.Produto;

import java.lang.reflect.Method;

public class Reflection7
{
    public static void main(String[] args)
    {

        try
        {
            Class<?> classObj = Class.forName("br.edu.unoesc.model.Produto");
            Produto produtoobj = (Produto) classObj.newInstance();
            Method method = classObj.getDeclaredMethod("VerProduto",null);
            method.setAccessible(true);

            method.invoke(produtoobj,null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}