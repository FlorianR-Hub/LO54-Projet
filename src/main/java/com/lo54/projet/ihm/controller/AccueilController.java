/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.ihm.model.AccueilModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Florian
 */
@Controller("accueilController")
@Scope("session")
public class AccueilController {

    @Autowired
    private AccueilModel accueilModel;

}
