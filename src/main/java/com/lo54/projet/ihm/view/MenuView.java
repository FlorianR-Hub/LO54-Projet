/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.MenuController;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Florian
 */
@Component("menuView")
@Scope("Session")
public class MenuView extends GenericView {

    private MenuController menuController;

    @Override
    public void initView() {

    }

}
