package org.ibase4j.service.sys.impl;

import org.ibase4j.mapper.sys.SysFeedbackMapper;
import org.ibase4j.model.sys.SysFeedback;
import org.ibase4j.service.sys.ISysFeedbackService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import top.ibase4j.core.base.BaseService;

/**
 * <p>
 * 反馈  服务实现类
 * </p>
 *
 * @author ShenHuaJie
 * @since 2017-03-12
 */
@Service
@CacheConfig(cacheNames = "SysFeedback")
public class SysFeedbackServiceImpl extends BaseService<SysFeedback, SysFeedbackMapper> implements ISysFeedbackService {

}