package com.example.springboottest1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest1.entity.Userinfoa;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Bruce
 * @since 2025-05-20
 */
@Mapper
@Repository
public interface UserinfoaMapper extends BaseMapper<Userinfoa> {
    public  Userinfoa verifyUserinfoa(Userinfoa userinfoa);
}
