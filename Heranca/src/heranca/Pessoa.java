/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Admin
 */
public class Pessoa {
    String Nome;
    String CPF;
    String Telefone;
    String Dt_Nascimento;
    
    public Pessoa(String Nome, String CPF, String Telefone, String Dt_Nascimento){
    this.Nome = Nome;
    this.CPF = CPF;
    this.Telefone = Telefone;
    this.Dt_Nascimento = Dt_Nascimento;
    }

    
        public void Info(){
        System.out.println("----Cadastro Pessoa----");        
        System.out.println("Nome: " + this.Nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Telefone: " + this.Telefone);
        System.out.println("Data de Nascimento: " + this.Dt_Nascimento);
        }
    
}
