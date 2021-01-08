package com.jfsk.testplatform.dao;

import com.jfsk.testplatform.entity.Cases;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseDao extends BaseDao<Cases> {
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
    Cases findById(@Param("id") int id);

    /**
     * 删除测试用例
     * @param id
     */
    void deleteByid(@Param("id") int id);

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
