/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class AssistenteAdministrativo extends Funcionario{
    String FormacaoAcademica;
    String Funcao;

    public AssistenteAdministrativo(String Nome, String RE, String FormacaoAcademica, String Funcao) {
        super(Nome, RE);
        this.FormacaoAcademica = FormacaoAcademica;
        this.Funcao = Funcao;
    }
    

}

