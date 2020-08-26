package com.study.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.mall.entity.MUser;
import com.study.mall.mapper.MUserMapper;
import com.study.mall.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements MUserService {

    @Autowired
    private MUserMapper userMapper;




    @Override
    public List<MUser> getList() {
        return userMapper.selectList(null);
    }

}
