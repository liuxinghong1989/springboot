package com.example.demo.base_security.captha.strategy;


import com.example.demo.base_security.captha.bean.CaptchaBean;

/**
 * Nothing seek, Nothing find.
 * author: shuzhilong
 * Date: 2017/9/26 下午2:54
 * desc: (The role of this class is to ...)
 * To change this template use preferences | editor | File and code Templates
 */
public interface ICaptchaStrategy {
    CaptchaBean generateCode();
}
