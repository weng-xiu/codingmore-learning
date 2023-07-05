package top.codingmore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.codingmore.model.EsPosts;

import java.util.List;

/**
 * 文章
 * @date 2020/11/2 22:00
 */
public interface EsPostMapper extends BaseMapper<EsPosts> {
    @Select("SELECT * FROM posts")
    List<EsPosts> getAll();
}
