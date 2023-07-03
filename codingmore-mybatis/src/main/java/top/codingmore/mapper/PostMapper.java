package top.codingmore.mapper;

import top.codingmore.entity.Posts;
import top.codingmore.entity.User;

import java.util.List;

/**
 * 文章mapper
 */
public interface PostMapper {

    /**
     * 获取所有文章
     * @return
     */
    List<Posts> getAll();

    /**
     * 根据id获取文章
     * @param id
     * @return
     */
    Posts getOne(Long id);

    /**
     * 插入文章
     * @param post
     */
    void insert(Posts post);

    /**
     * 更新文章
     * @param post
     */
    void update(Posts post);

    /**
     * 根据id删除文章
     * @param id
     */
    void delete(Long id);
}
