package com.myth.mythapiinterface.controller;

import com.myth.api.mythapiclientsdk.model.User;
import com.myth.api.mythapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称API
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        // String accessKey = request.getHeader("accessKey");
        // String nonce = request.getHeader("nonce");
        // String body = request.getHeader("body");
        // String timestamp = request.getHeader("timestamp");
        // String sign = request.getHeader("sign");
        //
        // // TODO 实际情况应该是 去数据库中查 是否已分配给用户
        // if (!accessKey.equals("chuan")) {
        //     throw new RuntimeException("无权限A");
        // }
        //
        // if (Long.parseLong(nonce) > 10000L) {
        //     throw new RuntimeException("无权限B");
        // }
        //
        // // TODO 时间和当前时间不能超过5分钟
        // // if (timestamp) {
        // // }
        //
        // // TODO 实际情况是: 从数据库中查出 secretKey
        // String serverSign = SignUtils.getSign(body, "yushu");
        // if (!sign.equals(serverSign)) {
        //     throw new RuntimeException("无权限C");
        // }

        String result = "myth-interface POST 用户名字是" + user.getUsername();
        System.out.println(result);
        return result;
    }

}


