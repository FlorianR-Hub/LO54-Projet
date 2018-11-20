/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.SearchCourseSessionsController;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.faces.context.FacesContext;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * View class for the course sessions search page.
 */
@Component("searchCourseSessionsView")
@Scope("session")
public class SearchCourseSessionsView extends GenericView {

    @Autowired
    private SearchCourseSessionsController searchCourseSessionsController;

    @Override
    public void initView() {
        // The initView() method is called for each AJAX call.
        // We only want to call it when we load the page.
        if (FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest()) {
            return;
        }

        searchCourseSessionsController.initModel();
    }

    /**
     * Call the register() method of the controller class.
     */
    public void onRegister() {
        searchCourseSessionsController.register();
    }

    public boolean filterByDate(Object value, Object filter, Locale locale) {

        if (filter == null) {
            return true;
        }

        if (value == null) {
            return false;
        }

        return DateUtils.truncatedEquals((Date) filter, (Date) value, Calendar.DATE);
    }

    /**
     * Returns the fill percentage of a course session.
     *
     * @param nbClients the number of clients registered in the course session.
     * @param maxClients The maximum number of clients allowed in the course
     * session.
     * @return
     */
    public float getFillingPercentage(int nbClients, int maxClients) {
        return (float) nbClients / maxClients * 100;
    }

}
