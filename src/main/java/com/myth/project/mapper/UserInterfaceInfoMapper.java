package com.myth.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myth.mythapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @author t
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
 * @createDate 2023-09-17 15:30:33
 * @Entity com.myth.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    // select interfaceInfoId, sum(totalNum) as totalNum from user_interface_info group by interfaceInfo order by totalNum desc limit 3
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




