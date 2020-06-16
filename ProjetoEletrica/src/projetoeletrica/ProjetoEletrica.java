package projetoeletrica;

import javax.swing.JOptionPane;

public class ProjetoEletrica {
    public static void main(String[] args) {
        
     ContaEletrica leitura = new ContaEletrica();
        
    leitura.setLeituraAnt(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura anterior:")));
    leitura.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura atual:")));
        
    int quantidade = leitura.leitura(leitura.getLeituraAnt(), leitura.getLeituraAtual());
    double Parcial = leitura.Cobranca(quantidade, leitura.getTusd(), leitura.getTe());
    leitura.setTotal(leitura.verificaBandeira(quantidade, Parcial));
    leitura.Conta(leitura.getTotal());   
    }   
}
