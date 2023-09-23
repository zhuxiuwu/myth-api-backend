package com.myth.mythapicommon.service;

/**
 * @author t
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 * @createDate 2023-09-17 15:30:35
 */
public interface InnerValidUserInterfaceInfoService {

    /**
     * 调用接口 剩余次数统计
     *
     * @param interfaceInfoId 接口 id
     * @param userId          用户 id
     * @return
     */
    boolean validUserInterfaceInfoLeftNum(long interfaceInfoId, long userId);
}