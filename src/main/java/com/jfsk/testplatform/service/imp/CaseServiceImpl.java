package com.jfsk.testplatform.service.imp;

import com.jfsk.testplatform.dao.CaseDao;
import com.jfsk.testplatform.entity.Cases;
import com.jfsk.testplatform.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl implements CaseService {
    @Autowired
    private CaseDao caseDao;


    @Override
    public List<Cases> findAll() {
        return caseDao.findAll();
    }

    @Override
    public Cases findById(Integer id) {

        return caseDao.findById(id);
    }

    @Override
    public void deleteByid(Integer id) {
        caseDao.deleteByid(id);

    }

    @Override
    public void saveCase(Cases cases) {
        caseDao.saveCase(cases);

    }

    @Override
    public void updateCase(Cases cases) {
        caseDao.updateCase(cases);
    }
}
