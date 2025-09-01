forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-proxy/src/main/java/com/poscodx/sample/{{nameCamelCase}}/proxy/client
fileName: {{nameCamelCase}}Client.java
---

import com.poscodx.reuse.common.audit.web.JsonWebTokenReader;
import com.poscodx.reuse.common.audit.web.AuthorizedUserInfo;

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
@RestController
@RequestMapping("/api/v1/projects")
public class projectClient {

    private final JsonWebTokenReader jsonWebTokenReader;

    @GetMapping(path = "/{id}")
    public void someMethod() {
        WebClient webClient = null;
        String result = client.get().uri("/callee/some-endpoint")
            .headers(httpHeaders -> {
                httpHeaders.add("token", token);
            })
            .accept(MediaType.APPLICATION_JSON)
            .bodyToMono(String.class)
            .block();

    }
}