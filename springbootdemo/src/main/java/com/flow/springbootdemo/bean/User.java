package com.flow.springbootdemo.bean;

/**
 * @Auther: liudongjie
 * @Date: 2019-11-07 18:13
 * @Description:
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="用户实体")
public class User {
    private Integer id;

    @ApiModelProperty("用户编号")
    private Long userId;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;
    @ApiModelProperty("用户地址")
    private String address;
    @ApiModelProperty("性别")
    private Integer sex;
    private Date createTime;

}
