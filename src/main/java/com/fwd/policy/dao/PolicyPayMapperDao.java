package com.fwd.policy.dao;

import com.fwd.policy.domain.BeforehandPolicyVo;

import java.util.List;

public interface PolicyPayMapperDao {
    /**
     * 获取所有policy_pay
     */
    List<BeforehandPolicyVo> queryAllPolicyPay();

}
