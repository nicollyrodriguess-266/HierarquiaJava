/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author Admin
 */
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Maria", "480.678.569-85","11 9 4002-8923", "18/02/2005");
        p1.Info();
        
        Estudante e1 = new Estudante("Guilherme","537.370.292-86","11 94002-8922", "04/06/2004", "28536", "Tenico em Desenvolvimento de Sitemas");    
        e1.Info();
        
        Docente d1 = new Docente("Eudora","445.333.675-89","11 9 2298-2004","05/07/2007","40028","Sistemas Embarcados");
        d1.Info();
        
        Funcionario f1 = new Funcionario("Marta","589.654.321-01","11 9 8922-4002","02/12/2003","52582","Coordenador");
        f1.Info();
    }
    
}
