/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.interf.CourseDao;
import com.lo54.projet.dao.interf.CourseSessionDao;
import com.lo54.projet.dao.interf.LocationDao;
import com.lo54.projet.service.data.ClientIhm;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test class of SearchCourseSessionsServiceImpl.
 */
public class SearchCourseSessionsServiceImplTest {

    @Mock
    private CourseDao courseDao;

    @Mock
    private CourseSessionDao courseSessionDao;

    @Mock
    private ClientDao clientDao;

    @Mock
    private LocationDao locationDao;

    @InjectMocks
    private SearchCourseSessionsServiceImpl searchCourseSessionsService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    // TODO : faire le test
    @Test
    public void testBuildCourseSessionsList() {

    }

    @Test
    public void testGetAllCitiesNames() {
        List<String> listCitiesNames = new ArrayList<>();
        listCitiesNames.add("Paris");
        listCitiesNames.add("Lyon");

        Mockito.when(locationDao.getAllCitiesNames()).thenReturn(listCitiesNames);

        searchCourseSessionsService.getAllCitiesNames();
    }

    @Test
    public void testCreateClient() {
        Mockito.doNothing().when(clientDao).create(new Client());

        ClientIhm client = new ClientIhm();
        searchCourseSessionsService.createClient(client);
    }

}
