package com.cp.subject.infra.basic.es;

import lombok.Data;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;

import javax.swing.*;

/**
 * @Author: q
 * @Description: TODO
 * @DateTime: 2024/11/2 下午1:57
 **/
@Data
public class EsSearchRequest {

    /**
     * 查询条件
     */
    private BoolQueryBuilder bq;

    /**
     * 查询字段
     */
    private String[] fields;

    /**
     * 页数
     */
    private int from;

    /**
     * 条数
     */
    private int size;

    /**
     * 是否需要快照
     */
    private Boolean needScroll;

    /**
     * 快照缓存时间
     */
    private Long minutes;

    /**
     * 排序字段
     */
    private String sortName;

    /**
     * 排序类型
     */
    private SortOrder sortOrder;

    /**
     * 高亮builder
     */
    private HighlightBuilder highlightBuilder;

}
