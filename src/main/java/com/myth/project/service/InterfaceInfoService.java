package com.myth.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.mythapicommon.model.entity.InterfaceInfo;

/**
 * @author t
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-09-03 14:48:33
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
