package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Post_tag_relation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 标签文章关系表 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface Post_tag_relationMapper extends BaseMapper<Post_tag_relation> {

}
