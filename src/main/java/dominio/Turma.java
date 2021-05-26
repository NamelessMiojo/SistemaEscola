/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import enumerator.eModEnsino;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Arthur
 */

@Getter @Setter @NoArgsConstructor
public class Turma {
    
    private int nome;
    private eModEnsino ensino;
    private int ano;
    private int totalAlunos;

}