package com.poscodx.sample.msaez0.store.postgresql;

import java.util.List;
import java.util.Optional;
import com.poscodx.sample.msaez0.store.ProjectStore;
import com.poscodx.sample.msaez0.store.domain.entity.Project;
import com.poscodx.sample.msaez0.store.postgresql.jpo.ProjectJpo;
import com.poscodx.sample.msaez0.store.postgresql.repository.ProjectPostgresqlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;


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
@Repository
public class ProjectPostgresqlStore
    implements ProjectStore
{
    private final ProjectPostgresqlRepository repository;

    @Override
    public List<Project> retrieveAll() {
        List<ProjectJpo> jpos = this.repository.findAll();
        return ProjectJpo.toDomains(jpos);
    }

    @Override
    public Project retrieve(Integer id) {
        Optional<ProjectJpo> retVal = this.repository.findById(id);
        if (retVal.isPresent()) {
            return retVal.get().toDomain();
        } else {
            return null;
        }
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public Project update(Project entity) {
        ProjectJpo jpoToUpdate = new ProjectJpo(entity);
        ProjectJpo updatedJpo = this.repository.save(jpoToUpdate);
        return updatedJpo.toDomain();
    }

    @Override
    public Project create(Project entity) {
        ProjectJpo jpoToSave = new ProjectJpo(entity);
        ProjectJpo savedJpo = this.repository.save(jpoToSave);
        return savedJpo.toDomain();
    }
}
