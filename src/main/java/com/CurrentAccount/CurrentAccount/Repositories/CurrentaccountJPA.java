package com.CurrentAccount.CurrentAccount.Repositories;

import javax.persistence.EntityManager;
import com.CurrentAccount.CurrentAccount.Models.corrienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentaccountJPA {
    @Autowired
    private EntityManager em;
 
    /*
     * Method to fetch all employees from the db.
     * @return
     */
    @SuppressWarnings("unchecked")
    public Iterable<corrienteDTO> getAllEmployees() {
        return em.createNamedStoredProcedureQuery("procedure-two").getResultList();
    }
}
