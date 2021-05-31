/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Arthur
 */
public class turmaDao {    
    private static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("sistemaEscola");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    
}
