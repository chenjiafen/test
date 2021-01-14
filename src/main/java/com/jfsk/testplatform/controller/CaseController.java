package com.jfsk.testplatform.controller;


import com.jfsk.testplatform.constant.Urls;
import com.jfsk.testplatform.dto.request.CaseDto;
import com.jfsk.testplatform.dto.respone.Result;
import com.jfsk.testplatform.dto.respone.StatusCode;
import com.jfsk.testplatform.enums.ResultEnum;
import com.jfsk.testplatform.enums.ResultUtil;
import com.jfsk.testplatform.service.CaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(Urls.ROOT + Urls.Cases.CASES)
public class CaseController {

    @Autowired
    private CaseService caseService;

    /**
     * 查询所有测试用例
     *
     * @return
     */
    @RequestMapping(value = Urls.Cases.FINDALL, method = RequestMethod.GET)
    public Result findCase() {
        log.info("查询全部用户");
        return new Result(StatusCode.OK, true, "查询成功", caseService.findAll());
    }

    /**
     * 根据id查询测试用例
     *
     * @param caseDto
     * @param
     * @return
     */
    @RequestMapping(value = Urls.Cases.FINDBYID, method = RequestMethod.POST)
    public Result findById(@Valid @RequestBody CaseDto caseDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(ResultEnum.PARAM_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        log.info("查询用户");
        return new Result(StatusCode.OK, true, "查询成功", caseService.findById(caseDto.getId()));
    }

    @RequestMapping(value = Urls.Cases.DELETED, method = RequestMethod.POST)
    public Result deleteByid(@Valid @RequestBody CaseDto caseDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(ResultEnum.PARAM_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        log.info("删除数据");
        caseService.deleteByid(caseDto.getId());
        return ResultUtil.sucess(ResultEnum.DELETED_SUCCES.getCode(), ResultEnum.DELETED_SUCCES.getMsg());
    }

//    @RequestMapping(value = Urls.Cases.DELETED, method = RequestMethod.POST)
//    public Result saveCase(@Valid @RequestBody CaseDto caseDto, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return new Result(StatusCode.ERROR, false, "参数错误");
//        }
//        log.info("删除数据");
//        caseService.deleteByid(caseDto.getId());
//        return ResultUtil.sucess(ResultEnum.DELETED_SUCCES.getCode(),ResultEnum.DELETED_SUCCES.getMsg());
//    }

}
