/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Aluno;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author savio
 */
public class AlunoDao {
    private static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("sistemaEscola");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public Aluno cadastrarAluno(Aluno aluno){
        entityManager.getTransaction().begin();
        entityManager.persist(aluno);
        entityManager.getTransaction().commit();
        return aluno;
    }
    
    public Aluno atualizarAluno(Aluno aluno){
        entityManager.getTransaction().begin();
        entityManager.merge(aluno);
        entityManager.getTransaction().commit();
        return aluno;
    }
    
    public Aluno deletarAluno(Aluno aluno){
        entityManager.getTransaction().begin();
        entityManager.remove(aluno);
        entityManager.getTransaction().commit();
        return aluno;
    }
    
    public Aluno buscarAlunoPorMatricula(Integer matricula){
        return entityManager.find(Aluno.class, matricula);
    }
    
    public List<Aluno> buscarTodosAlunos(Integer matricula){
        String sql = "From Aluno";
        
        Query query = entityManager.createQuery(sql);
        
        return query.getResultList();
    }
}
