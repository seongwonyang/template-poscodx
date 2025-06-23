forEach: BoundedContext
path: {{name}}/{{name}}-boot/src/main/java/com/poscodx/sample/{{name}}
fileName: SampleApplication.java
---
package com.poscodx.sample.{{name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Auto generated class
 * 
 * 자동생성 프로그램 버전 : 1.0.0
 * 생성일시 :  2025-06-19 11:29:02.759
 * @FileName : 클래스에 대한 한글 명칭
 * Change history
 * @수정날짜;SCR_NO;수정자;수정내용
 * @2025-06-19 11:29:02.759;00000;홍길동;최초생성
 * 
 */
@SpringBootApplication
@EntityScan(basePackages = {
    "com.poscodx.sample.{{name}}",
    "com.poscodx.reuse.common.util.kafka.db"
})
@EnableJpaRepositories(basePackages = {
    "com.poscodx.sample.{{name}}",
    "com.poscodx.reuse.common.util.kafka.db"
})
@RestController
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    @GetMapping(path = "/health")
    public String health() {
        return "ok";
    }
}
