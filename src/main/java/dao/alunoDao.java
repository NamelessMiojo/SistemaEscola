/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author savio
 */
public class alunoDao {
    private static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("sistemaEscola");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
}
