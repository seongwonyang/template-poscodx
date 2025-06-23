package com.poscodx.sample.msaez0.store;

import java.util.List;
import com.poscodx.base.share.util.json.JsonUtil;
import com.poscodx.sample.msaez0.store.ProjectStore;
import com.poscodx.sample.msaez0.store.domain.entity.Project;
import com.poscodx.sample.msaez0.store.postgresql.ProjectPostgresqlStore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


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
@EnableAutoConfiguration
@SpringBootTest(classes = {
    ApplicationContext.class,
    ProjectPostgresqlStore.class
})
public class ProjectStoreTest {
    @Autowired
    private ProjectStore store;

    @Test
    public void test() {
        List<Project> entities = this.store.retrieveAll();
        String json = JsonUtil.toJson(entities);
        System.out.println(entities.size());
        System.out.println(json);
    }
}
