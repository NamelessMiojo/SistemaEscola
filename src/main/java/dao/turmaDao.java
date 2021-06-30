/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
            Persistence.createEntityManagerFactory("sistemaEscolaPostgreSQL");
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
        String sql = "Select t From Turma t";
        
        Query query = entityManager.createQuery(sql,Turma.class);
        
        return query.getResultList();
    }
    
    public List<Turma> buscarTurmasFiltrado(Turma t, Integer pcd){
        String sql = "Select distinct t From Turma t"; 
        if(pcd!=2){
         sql = sql.concat(" ,Aluno a");
        }
         sql = sql.concat(" where 1 = 1");   
                
        
        if(t.getCodigo()!= null){
            sql = sql.concat(" and t.codigo = :codigo");
        }
        
        if(t.getNome()!= null){
            sql = sql.concat(" and t.nome = :nome");
        }
        
        if(t.getAno()!= null){
            sql = sql.concat(" and t.ano = :ano");
        }
        
        if(t.getEnsino()!= null){
            sql = sql.concat(" and t.ensino = :ensino");
        }
        
        /*if(pcd != null){
            sql = sql.concat(" and (a.turma = :turma and a.PCD in (:pcd))");
        }*/
        sql = sql.concat(" order by t.codigo");
        Query query = entityManager.createQuery(sql, Turma.class);
        
        if(t.getCodigo() != null){
            query.setParameter("codigo", t.getCodigo());
        }
        
        if(t.getNome()!= null){
            query.setParameter("nome", t.getNome());
        }
        
        if(t.getAno()!= null){
            query.setParameter("ano", t.getAno());
        }
        
        if(t.getEnsino()!= null){
            query.setParameter("ensino", t.getEnsino());
        }
        
        /*if(pcd != null){
            query.setParameter("turma", t);
            query.setParameter("pcd", pcd);
        }*/
        
        
        return query.getResultList();
    }
    
    
}
