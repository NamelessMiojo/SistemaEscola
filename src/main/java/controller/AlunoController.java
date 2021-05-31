/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AlunoDao;
import dominio.Aluno;

/**
 *
 * @author savio
 */
public class AlunoController {
    AlunoDao dao = new AlunoDao();
    
    public Aluno cadastrarAluno(Aluno aluno){
        return dao.cadastrarAluno(aluno);
    }

    public Aluno atualizarCadastro(Aluno aluno) {
        return dao.atualizarAluno(aluno);
    }

    public Aluno removerAluno(Integer matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        return dao.deletarAluno(aluno);
    }
    
    public Aluno buscarAlunoPorMatricula(Integer matricula){
        return dao.buscarAlunoPorMatricula(matricula);
    }
    
    
}
