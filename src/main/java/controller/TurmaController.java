/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TurmaDao;
import dominio.Turma;

/**
 *
 * @author Arthur
 */
public class TurmaController {
    TurmaDao dao = new TurmaDao();
    
    public Turma CadastrarTurma(Turma turma){
        return dao.cadastrarTurma(turma);
    }
    
    public Turma atualizarCadastro(Turma turma){
        return dao.atualizarTurma(turma);
    }
    
    public Turma removerTurma(Integer codigo){
        Turma turma = buscarTurmaPorCodigo(codigo);
        return dao.deletarTurma(turma);
    }
    
    public Turma buscarTurmaPorCodigo(Integer codigo){
        return dao.buscarTurmaPorCodigo(codigo);
    }
}
