package com.fwd.policy.service.Impl;

import com.fwd.policy.dao.PolicyPayMapperDao;
import com.fwd.policy.domain.BeforehandPolicyVo;
import com.fwd.policy.service.PolicyPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyPayServiceImpl implements PolicyPayService {

    private final PolicyPayMapperDao policyPayMapperDao;

    @Autowired
    public PolicyPayServiceImpl(PolicyPayMapperDao policyPayMapperDao) {
        this.policyPayMapperDao = policyPayMapperDao;
    }

    @Override
    public List<BeforehandPolicyVo> getAllPolicy() {
        return policyPayMapperDao.queryAllPolicyPay();
    }
}
