package top.codingmore.mpg.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.codingmore.mpg.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
