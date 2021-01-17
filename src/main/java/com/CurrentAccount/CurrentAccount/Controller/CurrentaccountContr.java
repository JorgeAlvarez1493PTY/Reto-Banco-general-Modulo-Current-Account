package com.CurrentAccount.CurrentAccount.Controller;

import com.CurrentAccount.CurrentAccount.Models.corrienteDTO;
import com.CurrentAccount.CurrentAccount.Repositories.CurrentaccountJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposit-account")
public class CurrentaccountContr {

    @Autowired
    CurrentaccountJPA     currentJPA;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/current")
    public Iterable<corrienteDTO> getAll() {
        logger.debug("Buscando cuentas corrientes");
        return currentJPA.getAllEmployees();
    }
    
}
