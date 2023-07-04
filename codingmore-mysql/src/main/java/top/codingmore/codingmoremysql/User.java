package top.codingmore.codingmoremysql;

import lombok.Data;

/**
 * <p>
 *     用户表
 * </p>
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/3/22
 */
@Data
public class User {

    // id
    private Integer id;

    // 名称
    private String name;

    // 密码
    private String password;

    // 年龄
    private Integer age;
}
