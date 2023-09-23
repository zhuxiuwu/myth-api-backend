package com.myth.api.mythapiclientsdk;

import com.myth.api.mythapiclientsdk.client.MythApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("myth.api.client")
@Data
@ComponentScan
public class MythApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public MythApiClient mythApiClient() {
        return new MythApiClient(accessKey, secretKey);
    }

}
