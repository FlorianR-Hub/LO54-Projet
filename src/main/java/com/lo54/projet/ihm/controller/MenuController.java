/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.ihm.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Florian
 */
@Controller("menuController")
@Scope("session")
public class MenuController {

    @Autowired
    private MenuModel menuModel;

}
