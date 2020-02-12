package com.warrior.controler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.plugins.Page;
import com.warrior.entity.WxUser;
import com.warrior.service.IShoeService;
import com.warrior.service.IWxUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-02-12
 */
@Controller
@RequestMapping("/shoe")
public class ShoeController {
	
	@Autowired
    IShoeService shoe;

	@Autowired
	IWxUserService userService;

	
    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam(defaultValue = "0") Integer type) {
        //insert
    	try {
    		WxUser user = new WxUser();
    		user.setBalance(new BigDecimal(type));
    		user.setSex(1);
    		user.setStatus(1);
    		user.setSource(1);
    		user.setIcon("type"+type);
    		user.setOpenid("open");
    		user.setWxappid("test");
    		user.setCreateTime(new Date());
    		user.setNickname("nickname");
    		this.userService.insert(user);
            return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "fail";
		}
    	
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public List<WxUser> list(@RequestParam(defaultValue = "0") Integer type) {
        //insert
    	List<WxUser> data = new ArrayList<WxUser>();
    	
    	try {
    		
    		data = this.userService.selectList(null);
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	return data;
    }
    
    @RequestMapping("/page")
    @ResponseBody
    public List<WxUser> page(@RequestParam(defaultValue = "0") Integer type) {
        //insert
    	List<WxUser> data = new ArrayList<WxUser>();
    	
    	try {
    		
    		Page<WxUser> selectPage = userService.selectPage(null, null);
    		
    		data = selectPage.getRecords();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	return data;
    }
    
}
