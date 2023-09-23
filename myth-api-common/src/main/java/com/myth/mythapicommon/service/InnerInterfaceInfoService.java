package com.myth.mythapicommon.service;

import com.myth.mythapicommon.model.entity.InterfaceInfo;

/**
 * @author t
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-09-03 14:48:33
 */
public interface InnerInterfaceInfoService {

    /**
     * 2. 从数据库中查询模拟接口是否存在, (请求路径, 请求方法, 请求参数)
     *
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
