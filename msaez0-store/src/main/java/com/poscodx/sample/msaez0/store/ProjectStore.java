forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-store/src/main/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/store
fileName: {{namePascalCase}}Store.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.store;

import java.util.List;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.entity.{{namePascalCase}};


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
public interface {{namePascalCase}}Store {

    List<{{namePascalCase}}> retrieveAll();

    void delete(Integer id);

    {{namePascalCase}} retrieve(Integer id);

    {{namePascalCase}} update({{namePascalCase}} entity);

    {{namePascalCase}} create({{namePascalCase}} entity);
}
