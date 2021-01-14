package com.jfsk.testplatform.dto.request;

import com.jfsk.testplatform.entity.Cases;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CaseDto {
    @NotNull(message = "id不能为空")
    private Integer  id;
    @NotBlank(message ="用例名不能为空")
    private String name;
    private String url;
}
