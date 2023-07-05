package com.example.codingmorejpa.service;

import com.example.codingmorejpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 用户表 Service
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/6/22
 */
public interface UserService {

    /**
     * 根据id查询
     * @param id id
     * @return 用户
     */
    User findById(Integer id);

    /**
     * 查询所有
     * @return 用户列表
     */
    List<User> findAll();

    /**
     * 保存
     * @param user 用户
     * @return 用户
     */
    User save(User user);
    void delete(Integer id);

    /**
     * 分页查询
     * @param pageable 分页参数
     * @return 用户列表
     */
    Page<User> findAll(Pageable pageable);


    /**
     * 根据名称模糊查询
     * @param name 名称
     * @return 用户列表
     */
    List<User> findByNameLike(String name);
}
