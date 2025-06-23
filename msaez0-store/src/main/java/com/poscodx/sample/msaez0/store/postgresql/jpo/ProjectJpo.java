package com.poscodx.sample.msaez0.store.postgresql.jpo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import com.poscodx.base.share.exception.PoscoException;
import com.poscodx.base.share.jpo.PoscoEntityJpo;
import com.poscodx.sample.msaez0.store.domain.entity.Project;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


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
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "ProjectJpo")
@Table(name = "project", schema = "public")
public class ProjectJpo
    extends PoscoEntityJpo
{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "pname")
    private String pname;
    @Column(name = "url")
    private String url;
    @Column(name = "lead")
    private String lead;
    @Column(name = "description")
    private String description;
    @Column(name = "pkey")
    private String pkey;
    @Column(name = "pcounter")
    private Integer pcounter;
    @Column(name = "assigneetype")
    private Integer assigneetype;
    @Column(name = "avatar")
    private Integer avatar;
    @Column(name = "originalkey")
    private String originalkey;
    @Column(name = "projecttype")
    private String projecttype;

    public ProjectJpo(Project entity) {
        BeanUtils.copyProperties(entity, this);
    }

    @Override
    public void validateJpo()
        throws PoscoException
    {
    }

    public Project toDomain() {
        Project entity = new Project();
        BeanUtils.copyProperties(this, entity);
        return entity;
    }

    public static List<Project> toDomains(Iterable<ProjectJpo> jpos) {
        return StreamSupport.stream(jpos.spliterator(), false).map((ProjectJpo::toDomain)).collect(Collectors.toList());
    }
}
