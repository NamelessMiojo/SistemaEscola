/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Arthur
 */

@Entity
@Table(name = "AlUNO")
@Getter @Setter @NoArgsConstructor
public class Aluno implements Serializable{
    
    @Id
    @Column(name = "ALU_MATRICULA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    
    @Column(name = "ALU_NOME")
    private String nome;
    
    @Column(name = "ALU_ANO_NASCIMENTO")
    private int anoNascimento;
    
    @Column(name = "ALU_PCD")
    private int PCD;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TUR_CODIGO")
    private List<Turma> listaTurma;
    
    public void addTurma(Turma turma){
        this.listaTurma.add(turma);
    }
}