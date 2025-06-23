package com.poscodx.sample.msaez0.facade.rest.store;

import java.util.List;
import com.poscodx.base.share.domain.NameValueList;
import com.poscodx.sample.msaez0.store.domain.entity.Project;
import com.poscodx.sample.msaez0.store.domain.logic.ProjectLogic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Slf4j
@RequiredArgsConstructor
@CrossOrigin("*")
@RestController
@RequestMapping(path = "/project")
public class ProjectResource {
    private final ProjectLogic logic;

    @GetMapping(path = "/all")
    public List<Project> findAll() {
        return this.logic.findAll();
    }

    @GetMapping(path = "/{id}")
    public Project find(@PathVariable("id") Integer id) {
        return this.logic.find(id);
    }

    @PostMapping
    public Project register(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return this.logic.register(entity);
    }

    @PutMapping(path = "/{id}")
    public Project modify(@PathVariable("id") Integer id, @org.springframework.web.bind.annotation.RequestBody NameValueList nameValues) {
        return this.logic.modify(id, nameValues);
    }

    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable("id") Integer id) {
        this.logic.remove(id);
    }
}
