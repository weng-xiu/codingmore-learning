package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Posts;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 文章 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface PostsMapper extends BaseMapper<Posts> {

}
