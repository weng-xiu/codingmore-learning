package top.codingmore.entity;

import lombok.Data;

/**
 * 文章标签实体类
 */
@Data
public class PostTag {

    /**
     * 标签Id
     */
    private Long postTagId;

    /**
     * 标签描述
     */
    private String description;
}
