public class Social extends Roupas{
    public void lavar(){
        super.lavar();
        System.out.println("Roupa Social lavada.");
    }
    public void dobrar(){
        super.dobrar();
        System.out.println("Roupa Social dobrada.");
    }
    public String toString(){
        return "Esporte"+super.toString();
    }
}