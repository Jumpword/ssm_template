package com.ssm.dao;

import com.ssm.entity.Demo;

/**
 * @Author jumping-張文平
 * @Date 2019/10/7 19:18
 * @Version 1.0
 */
public interface DemoMapper {
    Demo selectByPrimaryKey(Integer deptId);
}
