package com.warrior.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-02-12
 */
@TableName("wx_user")
public class WxUser extends Model<WxUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 帐户金额
     */
	private BigDecimal balance;
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 生日
     */
	private Date birthday;
    /**
     * 性别 0女 1男
     */
	private Integer sex;
    /**
     * 用户状态 1有效 0无效
     */
	private Integer status;
    /**
     * 地址
     */
	private String address;
    /**
     * 昵称
     */
	private String name;
    /**
     * 注册来源  1小程序  2android
     */
	private Integer source;
    /**
     * 昵称
     */
	private String nickname;
    /**
     * 密码
     */
	private String password;
    /**
     * 图片路径
     */
	private String icon;
    /**
     * 简介
     */
	private String introduction;
    /**
     * 电话
     */
	private String phone;
    /**
     * 邮件
     */
	private String email;
    /**
     * 微信用户标识
     */
	private String openid;
    /**
     * 微信用户标识
     */
	private String unionid;
    /**
     * 微信用户标识
     */
	private String wxappid;
    /**
     * 省id
     */
	@TableField("province_id")
	private String provinceId;
    /**
     * 城市id
     */
	@TableField("city_id")
	private String cityId;
    /**
     * 区域id
     */
	@TableField("area_id")
	private String areaId;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;


	public BigDecimal getBalance() {
		return balance;
	}

	public WxUser setBalance(BigDecimal balance) {
		this.balance = balance;
		return this;
	}

	public Long getId() {
		return id;
	}

	public WxUser setId(Long id) {
		this.id = id;
		return this;
	}

	public Date getBirthday() {
		return birthday;
	}

	public WxUser setBirthday(Date birthday) {
		this.birthday = birthday;
		return this;
	}

	public Integer getSex() {
		return sex;
	}

	public WxUser setSex(Integer sex) {
		this.sex = sex;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public WxUser setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public WxUser setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getName() {
		return name;
	}

	public WxUser setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getSource() {
		return source;
	}

	public WxUser setSource(Integer source) {
		this.source = source;
		return this;
	}

	public String getNickname() {
		return nickname;
	}

	public WxUser setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public WxUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public WxUser setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public String getIntroduction() {
		return introduction;
	}

	public WxUser setIntroduction(String introduction) {
		this.introduction = introduction;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public WxUser setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public WxUser setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getOpenid() {
		return openid;
	}

	public WxUser setOpenid(String openid) {
		this.openid = openid;
		return this;
	}

	public String getUnionid() {
		return unionid;
	}

	public WxUser setUnionid(String unionid) {
		this.unionid = unionid;
		return this;
	}

	public String getWxappid() {
		return wxappid;
	}

	public WxUser setWxappid(String wxappid) {
		this.wxappid = wxappid;
		return this;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public WxUser setProvinceId(String provinceId) {
		this.provinceId = provinceId;
		return this;
	}

	public String getCityId() {
		return cityId;
	}

	public WxUser setCityId(String cityId) {
		this.cityId = cityId;
		return this;
	}

	public String getAreaId() {
		return areaId;
	}

	public WxUser setAreaId(String areaId) {
		this.areaId = areaId;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public WxUser setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public WxUser setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
