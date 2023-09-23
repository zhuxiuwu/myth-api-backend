package com.myth.mythapicommon.service;


import com.myth.mythapicommon.model.entity.User;

/**
 * 用户服务
 */
public interface InnerUserService {


    /**
     * 1. 数据库中查是否已分配给用户秘钥 (accessKey, 布尔)
     *
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
