package top.codingmore.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

/**
 * 用户实体类
 */
@Data
@Builder
public class User {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    @Tolerate
    User() {}
}
