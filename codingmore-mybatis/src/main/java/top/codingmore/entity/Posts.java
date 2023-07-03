package top.codingmore.entity;

import java.util.Date;

import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

/**
 * 文章实体类
 */
@Data
@Builder
public class Posts {
    /**
     * 文章id
     */
    private Long postsId;

    /**
     * 文章作者
     */
    private Long postAuthor;

    /**
     * 文章文章标题
     */
    private String postContent;

    /**
     * 文章创建时间
     */
    private String postTitle;

    @Tolerate  // 用于生成无参构造器
    Posts() {}
}
