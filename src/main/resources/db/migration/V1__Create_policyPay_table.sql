use mysql;

drop table if exists `t_policy_pay`;

create table `t_policy_pay` (
                                `id` int(11) not null auto_increment comment '支付账单Id',
                                `caseType` varchar(20) default null comment '保障类型',
                                `currentDate` datetime default null comment '当前时间',
                                `branchCode` varchar(20) default null comment '',
                                `orgCode` varchar(20) default null comment '保单所属分公司编号',
                                primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET = utf8;

insert into t_policy_pay (caseType, currentDate, branchCode, orgCode)
values ('caseType1',now(),'branchCode1','orgCode1' ),
       ('caseType2',now(),'branchCode2','orgCode2' ),
       ('caseType3',now(),'branchCode3','orgCode3' )

