/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Veiculo {
    String Modelo;
    String Marca;
    int Ano;
    
    public Veiculo(String Modelo, String Marca, int Ano){
    this.Modelo = Modelo;
    this.Marca = Marca;
    this.Ano = Ano;
    }
    
    public void Info(){
    System.out.println("----Informacoes do veiculo:----");        
    System.out.println("Modelo: " + this.Modelo);
    System.out.println("Marca: " + this.Marca);
    System.out.println("Ano: " + this.Ano);
    }
}
