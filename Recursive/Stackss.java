package Recursive;

public class Stackss {
    public static void main(String[] args) {
        Stackss stack = new Stackss();
        stack.sauda("Erick");
        System.out.println(stack);        
    }
    public void tchau(){
        System.out.println("ok, tchau");
    }
    public void sauda2(String name){
        System.out.println("Como vai " + name + "?");
    }
    public void sauda(String name){
        System.out.println("Olá, " + name + "?");
        sauda2(name);
        System.out.println("preparando dizer tchau...");
        tchau();
    }
}
