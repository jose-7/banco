package projetodoestacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {
    
    public String placa;
    public String modelo;
    public double h_entrada;
    public double m_entrada;
    public double h_saida;
    public double m_saida;
    protected double preco;
    
    public double calcula_tempo (double h_entrada, double m_entrada, double h_saida, double m_saida){
        
        double conv_ent = h_entrada + m_entrada/60;
        double conv_saida = h_saida + m_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);      
        return tempo;

    }
    
    public void Gera_nota (double total_horas, double preco){
        
        double total = total_horas * preco;
        JOptionPane.showMessageDialog(null,"Estacionamento etec \n"
            + "Dados do veículo: \n" + "Placa: "+ getPlaca()+"\n" + "Modelo: "+getModelo()+"\n"
            + "Hora de entrada: "+ getH_entrada()+"h e "+ getM_entrada()+"min \n"
            + "Hora de saída: "+ getH_saida()+"h e "+ getM_saida()+"min \n"
            + "Valor total: " + total + " reais");
    }
    
  
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getH_entrada(){
        return h_entrada;
    }
    
    public void setH_entrada(double h_entrada){
        this.h_entrada = h_entrada;
    }
    
    public double getM_entrada(){
        return m_entrada;
    }
    
    public void setM_entrada(double m_entrada){
        this.m_entrada = m_entrada;
    }
    
    public double getH_saida(){
        return h_saida;
    }
       
    public void setH_saida(double h_saida){
        this.h_saida = h_saida;
    }
    
    public double getM_saida(){
        return m_saida;
    }

    
    public void setM_saida(double m_saida){
        this.m_saida = m_saida;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    } 
}
