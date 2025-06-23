package com.poscodx.sample.msaez0.store.domain.entity;

import com.poscodx.base.share.domain.PoscoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
public class Project
    extends PoscoEntity
{
    private Integer id;
    private String pname;
    private String url;
    private String lead;
    private String description;
    private String pkey;
    private Integer pcounter;
    private Integer assigneetype;
    private Integer avatar;
    private String originalkey;
    private String projecttype;
}
