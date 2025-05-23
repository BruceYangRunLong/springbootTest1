package com.example.springboottest1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboottest1.entity.Userinfoa;
import com.example.springboottest1.mapper.UserinfoaMapper;
import com.example.springboottest1.service.IUserinfoaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author phil
 * @since 2025-05-20
 */
@Service
public class UserinfoaServiceImpl extends ServiceImpl<UserinfoaMapper, Userinfoa> implements IUserinfoaService {
    @Autowired
    UserinfoaMapper userinfoaMapper;

    public boolean verifyUserinfoa(Userinfoa userinfoa) {
        Userinfoa userinfoa1 = baseMapper.verifyUserinfoa(userinfoa);
        if (userinfoa1 == null) {
            return false;
        }
        return true;
    }

    public boolean verifyUserinfoa2(Userinfoa userinfoa) {
        QueryWrapper<Userinfoa> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userinfoa.getUsername());
        queryWrapper.eq("password", userinfoa.getPassword());
        List<Userinfoa> list = userinfoaMapper.selectList(queryWrapper);
        if (list.size() < 1) {
            return false;
        }
        return true;

    }

    @Override
    public Userinfoa getUserinfoaById(Integer id) {

        return userinfoaMapper.selectById(id);
    }

    @Override
    public boolean updateUserinfoa(Userinfoa userinfoa) {

        int num = userinfoaMapper.updateById(userinfoa);
        if (num > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserinfoa(Integer id) {
        int num = userinfoaMapper.deleteById(id);
        if (num > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addUserinfoa(Userinfoa userinfoa) {
        int num = userinfoaMapper.insert(userinfoa);
        if (num > 0) {
            return true;
        }
        return false;
    }

}
