package com.fwd.policy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class BeforehandPolicyVo implements Serializable {
    private static final long serialVersionUID = 4402734148375799281L;

    private String id;

    private String caseType;//保障类型(代码、值)（寿险、重疾、意外）

    private String currentDate;//当前日期

    private String branchCode;

    private String orgCode;//保单所属分公司编号
}
