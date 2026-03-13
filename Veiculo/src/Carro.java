/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
    String tipoDeCombustivel;

    public Carro(String Modelo, String Marca, int Ano, String tipoDeCombustivel) {
        super(Modelo, Marca, Ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
    @Override
    public void Info(){
    System.out.println("----Informacoes do veiculo:----");        
    System.out.println("Modelo: " + this.Modelo);
    System.out.println("Marca: " + this.Marca);
    System.out.println("Ano: " + this.Ano);
    System.out.println("Tipo de Combustivel: " + this.tipoDeCombustivel);
        
    }
}
