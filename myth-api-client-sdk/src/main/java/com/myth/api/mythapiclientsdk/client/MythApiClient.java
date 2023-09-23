package com.myth.api.mythapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.myth.api.mythapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.myth.api.mythapiclientsdk.utils.SignUtils.getSign;

/**
 * 调用第三方接口的客户端
 *
 * @author chuan
 */
public class MythApiClient {

    private static final String GATEWAY_HOST = "http://43.138.84.102:8090";
    // private static final String GATEWAY_HOST = "http://localhost:8090";

    private String accessKey;
    private String secretKey;


    public MythApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String get = HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(get);
        return get;
    }

    public String getNameByPost(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String post = HttpUtil.post(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(post);
        return post;
    }

    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> map = new HashMap<>();
        map.put("accessKey", accessKey);
        // map.put("secretKey", secretKey); // 一定不能发给后端
        map.put("nonce", RandomUtil.randomNumbers(4));
        map.put("body", body);
        map.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        map.put("sign", getSign(body, secretKey));
        return map;
    }


    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse execute = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(execute.getStatus());
        String result2 = execute.body();
        System.out.println(result2);
        return result2;
    }
}
