public class Esporte extends Roupas{
    public void lavar(){
        super.lavar();
        System.out.println("Roupa de Esporte lavada.");
    }
    public void dobrar(){
        super.dobrar();
        System.out.println("Roupa de Esporte dobrada.");
    }
    public String toString(){
        return "Esporte "+ super.toString();
    }
}