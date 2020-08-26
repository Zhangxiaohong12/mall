package com.study.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.mall.entity.MUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mr.zhang
 * @since 2020-08-18
 */
public interface MUserService extends IService<MUser> {
    List<MUser> getList();
}
