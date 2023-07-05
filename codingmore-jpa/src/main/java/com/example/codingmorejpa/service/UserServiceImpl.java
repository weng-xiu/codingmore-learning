package com.example.codingmorejpa.service;

import com.example.codingmorejpa.entity.User;
import com.example.codingmorejpa.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表ServiceImpl
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/6/22
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserRepository userRepository;

    /**
     * 根据id查询
     * @param id id
     * @return 用户
     */
    @Override
    public User findById(Integer id) {
        return userRepository.getById(id);
    }

    /**
     * 查询所有
     * @return 用户列表
     */
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * 保存
     * @param user 用户
     * @return 用户
     */
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * 删除
     * @param id id
     */
    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    /**
     * 分页查询
     * @param pageable 分页参数
     * @return 用户列表
     */
    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    /**
     * 根据名称模糊查询
     * @param name 名称
     * @return 用户列表
     */
    @Override
    public List<User> findByNameLike(String name) {
//        return userRepository.findByNameLikeNativeQuery(name);
        return userRepository.findByNameLikeParam(name);
//        return userRepository.findByNameLike(name);
    }
}
