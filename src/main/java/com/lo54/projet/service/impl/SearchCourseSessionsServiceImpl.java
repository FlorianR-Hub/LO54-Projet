/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.CourseSession;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.interf.CourseSessionDao;
import com.lo54.projet.dao.interf.LocationDao;
import com.lo54.projet.service.converter.ClientConverter;
import com.lo54.projet.service.data.ClientIhm;
import com.lo54.projet.service.data.CourseSessionIhm;
import com.lo54.projet.service.interf.SearchCourseSessionsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchCourseSessionsServiceImpl implements SearchCourseSessionsService {

    @Autowired
    private CourseSessionDao courseSessionDao;

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private LocationDao locationDao;

    @Override
    public List<CourseSessionIhm> buildCourseSessionsList() {
        List<CourseSessionIhm> listFormations = new ArrayList<>();
        List<CourseSession> listCourseSessions = courseSessionDao.getAllValidCourseSessions();

        for (CourseSession cs : listCourseSessions) {
            CourseSessionIhm courseSessionIhm = new CourseSessionIhm();

            courseSessionIhm.setCourseSessionId(cs.getId());
            courseSessionIhm.setCourseCode(cs.getCourse().getCode());
            courseSessionIhm.setTitle(cs.getCourse().getTitle());
            courseSessionIhm.setStartDate(cs.getStartDate());
            courseSessionIhm.setEndDate(cs.getEndDate());
            courseSessionIhm.setCity(cs.getLocation().getCity());
            courseSessionIhm.setMaxClients(cs.getMaxClients());
            courseSessionIhm.setListClients(cs.getClients());

            listFormations.add(courseSessionIhm);
        }

        return listFormations;
    }

    @Override
    public List<String> getAllCitiesNames() {
        return locationDao.getAllCitiesNames();
    }

    @Override
    public void createClient(ClientIhm clientIhm) {
        clientDao.create(ClientConverter.convert(clientIhm));
    }

}
