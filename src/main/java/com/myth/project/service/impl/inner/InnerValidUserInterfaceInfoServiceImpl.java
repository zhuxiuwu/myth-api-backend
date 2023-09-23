package com.myth.project.service.impl.inner;

import com.myth.mythapicommon.service.InnerUserInterfaceInfoService;
import com.myth.mythapicommon.service.InnerValidUserInterfaceInfoService;
import com.myth.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerValidUserInterfaceInfoServiceImpl implements InnerValidUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean validUserInterfaceInfoLeftNum(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.validUserInterfaceInfoLeftNum(interfaceInfoId, userId);
    }
}
