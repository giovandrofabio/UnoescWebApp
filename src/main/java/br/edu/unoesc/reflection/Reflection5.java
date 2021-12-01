package br.edu.unoesc.reflection;

public class Reflection5 {
    public static void main(String[] args) {
        try {
            Class<?> classObj = Class.forName("br.edu.unoesc.model.Produto");

            System.out.println("Is a Interface = " + classObj.isInterface());

            System.out.println("Is a MemberClass = " + classObj.isMemberClass());

            System.out.println("Is a Primitive = " + classObj.isPrimitive());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
