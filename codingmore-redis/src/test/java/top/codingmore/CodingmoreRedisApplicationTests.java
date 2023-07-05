package top.codingmore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class CodingmoreRedisApplicationTests {

    /**
     * RedisTemplate是一个泛型类，可以进行任意类型的数据存储
     */
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * StringRedisTemplate是RedisTemplate的子类，只能进行字符串类型的数据存储
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis() {
        // 添加
        redisTemplate.opsForValue().set("name","沉默王二");
        // 查询
        System.out.println(redisTemplate.opsForValue().get("name"));
        // 删除
        redisTemplate.delete("name");
        // 更新
        redisTemplate.opsForValue().set("name","沉默王二的狗腿子");
        // 查询
        System.out.println(redisTemplate.opsForValue().get("name"));

        // 添加
        stringRedisTemplate.opsForValue().set("name","沉默王二");
        // 查询
        System.out.println(stringRedisTemplate.opsForValue().get("name"));
        // 删除
        stringRedisTemplate.delete("name");
        // 更新
        stringRedisTemplate.opsForValue().set("name","沉默王二的狗腿子");
        // 查询
        System.out.println(stringRedisTemplate.opsForValue().get("name"));

    }

}
