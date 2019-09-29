package com.test.service.testservice.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.test.service.testservice.dao.TestDao;
import com.test.service.testservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @TxcTransaction(propagation = DTXPropagation.SUPPORTS)
    //@LcnTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
    public void test() {
        testDao.test();
    }
}
