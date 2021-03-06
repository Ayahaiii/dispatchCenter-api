package com.monetware.dispatchcenter.system.base;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Cookie
 * @Date: 2019/1/17 16:45
 * @Description: 手机验证码
 */
@Data
public class SmsValidationCode {

    /**
     *手机号
     */
    private String phoneNo;

    /**
     *验证码
     */
    private String validationCode;

    /**
     *写入时间
     */
    private Date createTime;

}
