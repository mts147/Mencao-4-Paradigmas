import java.util.ArrayList;

public class GuardaRoupas {

    public ArrayList<Roupas> armario;
    public ArrayList<Roupas> lavanderia;
    public ArrayList<Roupas> emUso;

    public GuardaRoupas() {
        this.armario = new ArrayList<Roupas>();
        this.lavanderia = new ArrayList<Roupas>();
        this.emUso = new ArrayList<Roupas>();
    }

    public static void addRoupa(ArrayList<Roupas> compartimento, Roupas r) {
        compartimento.add(r);
    }

    public static void retiraRoupa(ArrayList<Roupas> compartimento, Roupas r) {
        if (compartimento.contains(r)) {
            compartimento.remove(r);
        }
    }

    public static void confereRoupas(ArrayList<Roupas> compartimento) {
        for (Roupas r : compartimento) {
            System.out.println(r);
        }
    }

    public static void contarRoupas(ArrayList<Roupas>compartimento) {
        int count = 0;
        for (Roupas r : compartimento) {
            count++;
        } ;

        System.out.println(count);
    }
}