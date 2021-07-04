package com.oleglmn.knowledgebase.patterns.structural.proxy;

import com.oleglmn.knowledgebase.patterns.structural.facade.FacadeApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
    "com.oleglmn.knowledgebase.patterns.structural.facade", "com.oleglmn.knowledgebase.patterns.structural.proxy"})
public class ProxyApp {
    public static void main(String[] args) {
        SpringApplication.run(ProxyApp.class, args);
    }
}
