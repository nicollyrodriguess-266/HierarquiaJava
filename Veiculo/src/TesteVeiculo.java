/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TesteVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Veiculo v1 = new Veiculo ("Monza","Chevrolet", 1996);
       v1.Info();
       
       Carro c1 = new Carro("Brasilia","Volkswagen", 1982, "Gasolina Comum");
       c1.Info();
      
       carroEletrico c2 = new carroEletrico ("Opalla","Chevrolet ", 1992, "60Ah a 70Ah");
       c2.Info();
    }
    
}
