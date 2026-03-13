/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Admin
 */
public class Docente extends Pessoa{
    String RF;
    String Disciplina;
    
    public Docente(String Nome, String CPF, String Telefone, String Dt_Nascimento, String RF, String Disciplina) {
    super(Nome, CPF, Telefone, Dt_Nascimento);
    this.RF = RF;
    this.Disciplina = Disciplina;
    }
        
    @Override
    public void Info(){
    System.out.println("----Cadastro Docente----");        
    System.out.println("Nome: " + this.Nome);
    System.out.println("CPF: " + this.CPF);
    System.out.println("Telefone: " + this.Telefone);
    System.out.println("Data de Nascimento: " + this.Dt_Nascimento);
    System.out.println("Registro de Funcionario: " + this.RF);
    System.out.println("Disciplina: " + this.Disciplina);
    }
    
}
