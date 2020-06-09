package projetodoestacionamento;

import javax.swing.JOptionPane;

public class ProjetodoEstacionamento {

    public static void main(String[] args) {
       
        Estacionamento dados = new Estacionamento();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo:"));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo:"));
        dados.setH_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada:")));
        dados.setM_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada:")));
        dados.setH_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saída:")));
        dados.setM_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saída:")));
        dados.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da hora:")));
        
        double total_horas = dados.calcula_tempo(dados.getH_entrada(),dados.getM_entrada(), dados.getH_saida(),dados.getM_saida());
        dados.Gera_nota(total_horas, dados.getPreco());
        
    }
    
}
