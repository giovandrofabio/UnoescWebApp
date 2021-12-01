package br.edu.unoesc.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import br.edu.unoesc.model.Produto;

public class Reflection1 {

    public static void main(String[] args) {
        Produto produto = new Produto(1,"Arroz","Alimento");

        Class<? extends Produto> produtoClass = produto.getClass();
        
        Method[] methodArray = produtoClass.getMethods();

        for (Method method : methodArray){
            System.out.println(method.getName());
        }

        System.out.println("---------------------------------------------------");

        Field[] fieldArray = produtoClass.getDeclaredFields();

        for (Field field : fieldArray){
            System.out.println(field.getName());
        }
    }
}
