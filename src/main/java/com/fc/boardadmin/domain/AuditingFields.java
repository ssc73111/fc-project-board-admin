package com.fc.boardadmin.domain;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AuditingFields {

    // 메타데이터는 자동 세팅되므로 Setter 를 사용하지 않음.
    /** 생성일시 */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt;
    /** 생성자 */
    @CreatedBy
    @Column(nullable = false, updatable = false, length = 100)
    protected String createdBy;
    /** 수정일시 */
    @LastModifiedDate
    @Column(nullable = false)
    protected LocalDateTime modifiedAt;
    /** 수정자 */
    @LastModifiedBy
    @Column(nullable = false, length = 100)
    protected String modifiedBy;
}
