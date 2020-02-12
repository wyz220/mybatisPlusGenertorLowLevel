package com.warrior.serviceImpl;

import com.warrior.entity.Shoe;
import com.warrior.mapper.ShoeMapper;
import com.warrior.service.IShoeService;
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
public class ShoeServiceImpl extends ServiceImpl<ShoeMapper, Shoe> implements IShoeService {
	
}
