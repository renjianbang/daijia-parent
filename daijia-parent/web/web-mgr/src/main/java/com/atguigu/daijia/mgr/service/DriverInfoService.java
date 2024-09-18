package com.atguigu.daijia.mgr.service;

import com.atguigu.daijia.model.vo.driver.DriverLoginVo;

public interface DriverInfoService {

    DriverLoginVo getDriverLoginInfo(Long driverId);
}
