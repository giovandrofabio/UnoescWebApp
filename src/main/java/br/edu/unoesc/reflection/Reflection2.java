package br.edu.unoesc.reflection;

public class Reflection2 {
    public static void main(String[] args) {
        try {
            Class<?> classObj = Class.forName("br.edu.unoesc.model.Produto");
            System.out.println(classObj.getName());
            System.out.println(classObj.getSimpleName());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
