package com.jfsk.testplatform.constant;

public interface Urls {
    /**
     * 接口版本
     */
    String ROOT="/v1";

    /**
     * case 模块
     */
    interface Cases{
        String CASES="/cases";
        String FINDALL="/findAll";
        String FINDBYID="/findById";
        String DELETED="/deletedById";
        String SAVECASE="/saveCase";
        String UPDATECASE="/updateCase";
    }
}
