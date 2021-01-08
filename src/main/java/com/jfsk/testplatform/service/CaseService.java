package com.jfsk.testplatform.service;

import com.jfsk.testplatform.entity.Cases;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseService {
    /**
     * 查询所有测试用例
     * @return
     */
    List<Cases> findAll();

    /**
     * 查询指定测试用例
     * @param id
     * @return
     */
    Cases findById(Integer id);

    /**
     * 删除测试用例
     * @param id
     */
    void deleteByid(Integer id);

    /**
     * 保存测试用列
     * @param cases
     */
    void saveCase(Cases cases);

    /**
     * 更新测试用例
     * @param cases
     */
    void updateCase(Cases cases);

}
