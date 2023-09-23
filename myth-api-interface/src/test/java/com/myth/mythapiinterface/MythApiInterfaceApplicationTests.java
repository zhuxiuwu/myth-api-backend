package com.myth.mythapiinterface;

import com.myth.api.mythapiclientsdk.client.MythApiClient;
import com.myth.api.mythapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MythApiInterfaceApplicationTests {

    @Resource
    private MythApiClient mythApiClient;

    @Test
    void contextLoads() {
        String chuan = mythApiClient.getNameByGet("chuan");
        User user = new User();
        user.setUsername("yushu");
        String usernameByPost = mythApiClient.getUsernameByPost(user);
        System.out.println(chuan);
        System.out.println(usernameByPost);
    }
}
