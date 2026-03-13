/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class carroEletrico extends Veiculo {
    String capacidadeBateira;
    
    public carroEletrico(String Modelo, String Marca, int Ano, String capacidadeBateira) {
        super(Modelo, Marca, Ano);
        this.capacidadeBateira = capacidadeBateira;
    }
    
    @Override
    public void Info(){
    System.out.println("----Informacoes do veiculo:----");        
    System.out.println("Modelo: " + this.Modelo);
    System.out.println("Marca: " + this.Marca);
    System.out.println("Ano: " + this.Ano);
    System.out.println("Capacidade da Bateria: " + this.capacidadeBateira);
        
    }
}
