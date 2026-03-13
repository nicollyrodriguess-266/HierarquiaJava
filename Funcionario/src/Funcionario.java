/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario {
    String Nome;
    String RE;
    
    public Funcionario(String Nome, String RE){
    this.Nome = Nome;
    this.RE = RE;
    }
    
    public void Info(){
    System.out.println("----Informacoes do Funcionario----");
    System.out.println("Nome do funcionario: " + this.Nome);
    System.out.println("Registro do Empregado: " + this.RE);
    }
}
