package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Comments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface CommentsMapper extends BaseMapper<Comments> {

}
