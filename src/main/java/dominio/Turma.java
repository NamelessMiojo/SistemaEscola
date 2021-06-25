/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import enumerator.eModEnsino;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Arthur
 */

@Entity
@Table(name = "TURMA")
@Getter @Setter @NoArgsConstructor
public class Turma implements Serializable{
    
    @Id
    @Column(name = "TUR_CODIGO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name = "TUR_NOME")
    private String nome;
    
    @Column(name = "TUR_ENSINO")
    private String ensino;
    
    @Column(name = "TUR_ANO")
    private Integer ano;
    
    @Column(name = "TUR_QUANTIDADE")
    private Integer quantidade;
    

}