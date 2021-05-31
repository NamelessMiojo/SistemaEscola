/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Turma;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Arthur
 */
public class TurmaDao {    
    private static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("sistemaEscola");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    
    public Turma cadastrarTurma(Turma turma){
        entityManager.getTransaction().begin();
        entityManager.persist(turma);
        entityManager.getTransaction().commit();
        return turma;
    }
    
    public Turma atualizarTurma(Turma turma){
        entityManager.getTransaction().begin();
        entityManager.merge(turma);
        entityManager.getTransaction().commit();
        return turma;
    }
    
    public Turma deletarTurma(Turma turma){
        entityManager.getTransaction().begin();
        entityManager.remove(turma);
        entityManager.getTransaction().commit();
        return turma;
    }
        
    public Turma buscarTurmaPorCodigo(Integer codigo){
        return entityManager.find(Turma.class, codigo);
    }
    
    public List<Turma> buscarTodasTurma(){
        String sql = "From Turma";
        
        Query query = entityManager.createQuery(sql);
        
        return query.getResultList();
    }
}
