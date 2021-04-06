package com.fwd.policy.controller;

import com.fwd.policy.domain.BeforehandPolicyVo;
import com.fwd.policy.service.PolicyPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/insure")
public class PolicyPayServiceController {
    private final PolicyPayService policyPayService;

    @Autowired
    public PolicyPayServiceController(PolicyPayService policyPayService) {
        this.policyPayService = policyPayService;
    }

    @RequestMapping(value = "/queryAllPolicyPay")
    public List<BeforehandPolicyVo> queryAllPolicyPay() {
        return policyPayService.getAllPolicy();
    }
}
