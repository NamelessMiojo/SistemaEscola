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
import dominio.Turma;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author savio
 */
public class AlunoDao {
    private static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("sistemaEscolaPostgreSQL");
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
    
    public List<Aluno> buscarTodosAlunos(){
        String sql = "From Aluno";
        
        Query query = entityManager.createQuery(sql);
        
        return query.getResultList();
    }
    
    public List<Aluno> buscarTodosAlunosTurma(Turma t){
        String sql = "Select a From Aluno a where a.turma = :t";
        
        Query query = entityManager.createQuery(sql, Aluno.class);
        query.setParameter("t", t);
        
        return query.getResultList();
    }
    
    public List<Aluno> buscarAlunosFiltrado(Aluno a){
        String sql = "Select a From Aluno a where 1 = 1";
        
        if(a.getAnoNascimento() != null){
            sql = sql.concat(" and a.anoNascimento = :ano");
        }
        
        if(a.getMatricula()!= null){
            sql = sql.concat(" and a.matricula = :matricula");
        }
        
        if(a.getTurma()!= null){
            sql = sql.concat(" and a.turma = :turma");
        }
        
        if(a.getPCD()!= null){
            sql = sql.concat(" and a.PCD = :pcd");
        }
        
        if(a.getNome()!= null){
            sql = sql.concat(" and a.nome = :nome");
        }
        
        Query query = entityManager.createQuery(sql, Aluno.class);
        
        if(a.getAnoNascimento() != null){
            query.setParameter("ano", a.getAnoNascimento());
        }
        
        if(a.getMatricula()!= null){
            query.setParameter("matricula", a.getMatricula());
        }
        
        if(a.getTurma()!= null){
            query.setParameter("turma", a.getTurma());
        }
        
        if(a.getPCD()!= null){
            query.setParameter("pcd", a.getPCD());
        }
        
        if(a.getNome()!= null){
            query.setParameter("nome", a.getNome());
        }
        
        return query.getResultList();
    }
    
    
}
