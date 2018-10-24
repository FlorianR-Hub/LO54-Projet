/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.AccueilController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Florian
 */
@Component("accueilView")
@Scope("Session")
public class AccueilView extends GenericView {

    @Autowired
    private AccueilController accueilController;

    @Override
    public void initView() {

    }

}
