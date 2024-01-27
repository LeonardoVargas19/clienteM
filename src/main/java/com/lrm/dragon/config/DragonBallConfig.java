package com.lrm.dragon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.application.name")
@RefreshScope
public class DragonBallConfig {
    @Value("${spring.application.name}")
    private String applicationName;

    public String getAplicationName() {
        return applicationName;
    }

    public void setAplicationName(String aplicationName) {
        this.applicationName = aplicationName;
    }
}
