/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa{
    String RGM;
    String Cargo;
    
    public Funcionario(String Nome, String CPF, String Telefone, String Dt_Nascimento, String RGM, String Cargo) {
    super(Nome, CPF, Telefone, Dt_Nascimento);
    this.RGM = RGM;
    this.Cargo = Cargo;
    }
        
    @Override
    public void Info(){
    System.out.println("----Cadastro Funcionario----");        
    System.out.println("Nome: " + this.Nome);
    System.out.println("CPF: " + this.CPF);
    System.out.println("Telefone: " + this.Telefone);
    System.out.println("Data de Nascimento: " + this.Dt_Nascimento);
    System.out.println("Registro Geral de Matricula: " + this.RGM);
    System.out.println("Cargo: " + this.Cargo);
    }
}
