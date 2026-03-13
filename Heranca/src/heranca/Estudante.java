/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Admin
 */
public class Estudante extends Pessoa{
    
    String RM;
    String Curso;

    public Estudante(String Nome, String CPF, String Telefone, String Dt_Nascimento, String RM, String Curso) {
        super(Nome, CPF, Telefone, Dt_Nascimento);
        this.RM = RM;
        this.Curso = Curso;
    }
    
    
    @Override
    public void Info(){
        System.out.println("----Cadastro Estudante----");        
        System.out.println("Nome: " + this.Nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Telefone: " + this.Telefone);
        System.out.println("Data de Nascimento: " + this.Dt_Nascimento);
        System.out.println("Registro de Matricula: " + this.RM);
        System.out.println("Curso: " + this.Curso);
        
    }
}
