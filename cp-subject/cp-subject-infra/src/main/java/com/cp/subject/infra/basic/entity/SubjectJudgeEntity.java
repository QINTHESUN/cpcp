package com.cp.subject.infra.basic.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 判断题(SubjectJudge)表实体类
 * 
 * @author makejava
 * @since 2024-10-22 20:12:40
 */

@Data
@TableName("subject_judge")
public class SubjectJudgeEntity  implements Serializable {
    private static final long serialVersionUID = -75686639341681976L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 题目id
     */
    private Long subjectId;

    /**
     * 是否正确
     */
    private Integer isCorrect;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer isDeleted;

}

