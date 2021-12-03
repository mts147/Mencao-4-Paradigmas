import java.util.ArrayList;
public class Roupas{
    private String descricao;
    private String cor;
    private String situacao;
    private String estampa;
    private int manequim;


    //gets e sets

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getEstampa(){
        return estampa;
    }

    public void setEstampa(String estampa){
        this.estampa = estampa;
    }

    public int getManequim(){
        return manequim;
    }

    public void setManequim(int manequim){
        this.manequim = manequim;
    }

    public String getSituacao(){
        return situacao;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }

    public void dobrar(){
        System.out.println("Roupa dobrada");
    }
    public void lavar(){
        System.out.println("Roupa lavada");
    }
    public String toString(){
        return this.descricao+" "+this.cor+" "+this.manequim+" "+this.situacao;
    }
}








