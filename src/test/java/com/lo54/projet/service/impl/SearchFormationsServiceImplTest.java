/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.interf.CourseDao;
import com.lo54.projet.dao.interf.CourseSessionDao;
import com.lo54.projet.dao.interf.LocationDao;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Florian
 */
public class SearchFormationsServiceImplTest {

    @Mock
    private CourseDao courseDao;

    @Mock
    private CourseSessionDao courseSessionDao;

    @Mock
    private ClientDao clientDao;

    @Mock
    private LocationDao locationDao;

    @InjectMocks
    private SearchFormationsServiceImpl searchFormationsService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    // TODO : faire le test
    @Test
    public void testBuildFormationsList() {

    }

    @Test
    public void testGetAllCitiesNames() {
        List<String> listCitiesNames = new ArrayList<>();
        listCitiesNames.add("Paris");
        listCitiesNames.add("Lyon");

        Mockito.when(locationDao.getAllCitiesNames()).thenReturn(listCitiesNames);

        searchFormationsService.getAllCitiesNames();
    }

    @Test
    public void testCreateClient() {
        Client client = new Client();
        Mockito.doNothing().when(clientDao).create(client);

        searchFormationsService.createClient(client);
    }

}
