package com.myth.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.mythapicommon.model.entity.UserInterfaceInfo;

/**
 * @author t
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-09-03 14:48:33
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId 接口 id
     * @param userId          用户 id
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);


    /**
     * 调用接口 剩余次数统计
     *
     * @param interfaceInfoId 接口 id
     * @param userId          用户 id
     * @return
     */
    boolean validUserInterfaceInfoLeftNum(long interfaceInfoId, long userId);
}
