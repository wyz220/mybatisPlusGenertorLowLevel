package com.warrior.serviceImpl;

import com.warrior.entity.WxUser;
import com.warrior.mapper.WxUserMapper;
import com.warrior.service.IWxUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-02-12
 */
@Service
public class WxUserServiceImpl extends ServiceImpl<WxUserMapper, WxUser> implements IWxUserService {
	
}
