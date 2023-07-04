package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
