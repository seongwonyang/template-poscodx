forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-boot/src/test/java/com/poscodx/{{options.serviceId}}/{{nameCamelCase}}
fileName: {{options.serviceId}}ApplicationTest.java
---
package com.poscodx.{{options.serviceId}}.{{nameCamelCase}};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Auto generated class
 * 
 * 자동생성 프로그램 버전 : 1.0.0
 * 생성일시 :  {{currentTimestamp}}
 * @FileName : 클래스에 대한 한글 명칭
 * Change history
 * @수정날짜;SCR_NO;수정자;수정내용
 * @{{currentTimestamp}};00000;홍길동;최초생성
 * 
 */
@SpringBootTest
public class {{options.serviceId}}ApplicationTest {

    @Test
    public void contextLoads() {
    }
}
