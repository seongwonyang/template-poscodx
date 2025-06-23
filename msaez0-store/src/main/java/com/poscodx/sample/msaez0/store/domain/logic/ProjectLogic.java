package com.poscodx.sample.msaez0.store.domain.logic;

import java.util.List;
import com.poscodx.base.share.domain.NameValueList;
import com.poscodx.sample.msaez0.store.ProjectStore;
import com.poscodx.sample.msaez0.store.domain.entity.Project;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;


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
@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class ProjectLogic {
    private final MessageSource messageSource;
    private final ProjectStore store;

    public List<Project> findAll() {
        return this.store.retrieveAll();
    }

    public Project find(Integer id) {
        return this.store.retrieve(id);
    }

    public void remove(Integer id) {
        this.store.delete(id);
    }

    public Project register(Project entity) {
        return this.store.create(entity);
    }

    public Project modify(Integer id, NameValueList nameValues) {
        Project entity = this.store.retrieve(id);
        entity.setValues(nameValues);
        return this.store.update(entity);
    }
}
