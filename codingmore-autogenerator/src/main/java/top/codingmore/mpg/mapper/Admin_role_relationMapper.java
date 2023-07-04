package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Admin_role_relation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 后台用户和角色关系表 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface Admin_role_relationMapper extends BaseMapper<Admin_role_relation> {

}
