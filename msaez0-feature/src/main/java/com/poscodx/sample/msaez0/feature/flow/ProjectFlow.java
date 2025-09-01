forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-feature/src/main/java/com/poscodx/{{options.serviceId}}/{{boundedContext.nameCamelCase}}/feature/flow
fileName: {{namePascalCase}}Flow.java
---
package com.poscodx.{{options.serviceId}}.{{boundedContext.nameCamelCase}}.feature.flow;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.poscodx.{{options.serviceId}}.{{boundedContext.nameCamelCase}}.feature.action.{{namePascalCase}}Action;
import com.poscodx.{{options.serviceId}}.{{boundedContext.nameCamelCase}}.store.domain.entity.{{namePascalCase}};
{{#commands}}
import com.poscodx.{{options.serviceId}}.{{boundedContext.nameCamelCase}}.store.domain.dto.{{namePascalCase}}Dto;
{{/commands}}
{{#attached 'View' this}}
import com.poscodx.{{options.serviceId}}.{{boundedContext.nameCamelCase}}.store.domain.dto.{{namePascalCase}}Dto;
{{/attached}}


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
@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class {{namePascalCase}}Flow {
    private final MessageSource messageSource;
    private final {{namePascalCase}}Action action;

    // command
    {{#commands}}
    {{#if isRestRepository}}
    public void {{nameCamelCase}}({{namePascalCase}}Dto {{nameCamelCase}}Dto) {
        // action.someMethod();
    }
    {{else}}
    {{/if}}
    {{/commands}}

    // view
    {{#attached 'View' this}}
    public {{../namePascalCase}} {{nameCamelCase}}({{namePascalCase}}Dto {{nameCamelCase}}Dto) {
        // action.someMethod();
    }
    {{/attached}}
}
