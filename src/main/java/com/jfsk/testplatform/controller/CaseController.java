package com.jfsk.testplatform.controller;


import com.jfsk.testplatform.dto.respone.Result;
import com.jfsk.testplatform.dto.respone.StatusCode;
import com.jfsk.testplatform.service.CaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class CaseController {

@Autowired
private CaseService caseService;

@RequestMapping(value="/findall",method = RequestMethod.GET)
    public Result findCase(){
    log.info("查询全部用户");
    return new Result(StatusCode.OK,true,"查询成功",caseService.findAll());
}

}
