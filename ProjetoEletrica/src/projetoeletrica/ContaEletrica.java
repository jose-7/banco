package projetoeletrica;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ContaEletrica {
    
    public int LeituraAnt;
    public int LeituraAtual;
    public double tusd = 0.3;
    public double te = 0.29;
    public double total;
    public double ValorParcial;
    public String Bandeira;
    public int diferencaLeitura;
    
       public int leitura (int LeituratAnt, int LeituraAtual){
           
        int diferenca = LeituraAtual - LeituraAnt;
        this.setDiferencaLeitura(diferenca);
        return diferenca;
    }
    public double Cobranca (int quantidade, double tusd, double te){
        
        double CalculoTe = quantidade * te;
        double CalculoTusd = quantidade * tusd;
        double Parcial = CalculoTe + CalculoTusd;
        return Parcial; 
    }
    public double verificaBandeira (int quantidade, double Parcial){
        
        double Total = 0;
        
        if (quantidade < 100){
            Total = Parcial; 
            Bandeira = "Verde";      
        }
        else if (quantidade >= 100 && quantidade < 150){
            Total = (quantidade * 0.01343)+ Parcial;
            Bandeira = "Amarela"; 
        }
        else if (quantidade >= 150 && quantidade < 200){
            Total = (quantidade * 0.04169)+ Parcial;
            Bandeira = "Vermelha 1"; 
        }
        else {
            Total = (quantidade * 0.06243)+ Parcial;
            Bandeira = "Vermelha 2";  
        } 
        return Total;  
    }
    public void Conta(double total){
        
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Companhia Elétrica \n"
                + "Consumo Anterior: " + this.getLeituraAnt()+ " kw \n"
                + "Consumo Atual: " + this.getLeituraAtual()+ " kw \n"
                + "Quantidade Consumida: " + this.getDiferencaLeitura()+ " kw \n"
                + "Bandeira: " + this.getBandeira()+ " \n"
                + "Valor Total: " + df.format(this.getTotal())+ " reais");      
    }
    public int getLeituraAnt(){
        return LeituraAnt;
    }
    public void setLeituraAnt(int LeituraAnt){
        this.LeituraAnt = LeituraAnt;
    }
    public int getLeituraAtual(){
        return LeituraAtual;
    }
    public void setLeituraAtual(int LeituraAtual){
        this.LeituraAtual = LeituraAtual;
    }
    public double getTusd(){
        return tusd;
    }
    public void setTusd(double tusd){
        this.tusd = tusd;
    }
    public double getTe(){
        return te;
    }
    public void setTe(double te){
        this.te = tusd;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public double getValorParcial(){
        return ValorParcial;
    }
    public void setValorParcial(double ValorParcial){
        this.ValorParcial = ValorParcial;
    }
    public String getBandeira(){
        return Bandeira;
    }
    public void setBandeira(String Bandeira){
        this.Bandeira = Bandeira;
    }
    public int getDiferencaLeitura(){
        return diferencaLeitura;
    }
    public void setDiferencaLeitura(int diferencaLeitura){
        this.diferencaLeitura = diferencaLeitura;
    } 
}