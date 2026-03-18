/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Funcionario {
    String numMatricula; 
    String nome; 
    double salario;
    
    public Funcionario(String numMatricula, String nome, double salario){
        this.nome = nome;
        this.numMatricula = numMatricula;         
        this.salario = salario;
        
    }
    
    public void infoF(){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Numero de matricula: "+ this.numMatricula );
        System.out.println("Salário: " + this.salario);

    }
}
