package com.example.springboottest1.service;

import com.example.springboottest1.entity.Userinfoa;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Bruce
 * @since 2025-05-20
 */
public interface IUserinfoaService extends IService<Userinfoa> {

    public boolean verifyUserinfoa(Userinfoa userinfoa);
    public boolean verifyUserinfoa2(Userinfoa userinfoa);

    public Userinfoa getUserinfoaById(Integer id);
    public boolean updateUserinfoa(Userinfoa userinfoa);
    public boolean deleteUserinfoa(Integer id);
    public boolean addUserinfoa(Userinfoa userinfoa);
}
