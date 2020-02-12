package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-02-12
 */
public class Shoe extends Model<Shoe> {

    private static final long serialVersionUID = 1L;

	@TableId(value="shoe_id", type= IdType.AUTO)
	private Long shoeId;
    /**
     * 图片路径
     */
	@TableField("file_id")
	private Long fileId;
    /**
     * 名称
     */
	private String name;
    /**
     * 发售年份
     */
	private Integer year;
    /**
     * 发售价格
     */
	@TableField("release_price")
	private Double releasePrice;
    /**
     * 货号
     */
	private String sn;
    /**
     * 1启用  0封停
     */
	private Integer state;
    /**
     * 更新时间
     */
	@TableField("modify_date")
	private Date modifyDate;
    /**
     * 创建时间
     */
	@TableField("create_date")
	private Date createDate;
    /**
     * 1跑鞋  2篮球鞋
     */
	@TableField("shoe_type")
	private Integer shoeType;
	@TableField("is_check")
	private Integer isCheck;
    /**
     * 作者标识
     */
	@TableField("author_id")
	private Long authorId;
    /**
     * 测评数量
     */
	@TableField("evaluation_num")
	private Integer evaluationNum;
    /**
     * 粉丝数量
     */
	@TableField("user_num")
	private Integer userNum;
    /**
     * 配色数量
     */
	@TableField("color_num")
	private Integer colorNum;
    /**
     * 热度值，通过某种算法获得
     */
	@TableField("hot_num")
	private Integer hotNum;


	public Long getShoeId() {
		return shoeId;
	}

	public Shoe setShoeId(Long shoeId) {
		this.shoeId = shoeId;
		return this;
	}

	public Long getFileId() {
		return fileId;
	}

	public Shoe setFileId(Long fileId) {
		this.fileId = fileId;
		return this;
	}

	public String getName() {
		return name;
	}

	public Shoe setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getYear() {
		return year;
	}

	public Shoe setYear(Integer year) {
		this.year = year;
		return this;
	}

	public Double getReleasePrice() {
		return releasePrice;
	}

	public Shoe setReleasePrice(Double releasePrice) {
		this.releasePrice = releasePrice;
		return this;
	}

	public String getSn() {
		return sn;
	}

	public Shoe setSn(String sn) {
		this.sn = sn;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Shoe setState(Integer state) {
		this.state = state;
		return this;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public Shoe setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
		return this;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Shoe setCreateDate(Date createDate) {
		this.createDate = createDate;
		return this;
	}

	public Integer getShoeType() {
		return shoeType;
	}

	public Shoe setShoeType(Integer shoeType) {
		this.shoeType = shoeType;
		return this;
	}

	public Integer getIsCheck() {
		return isCheck;
	}

	public Shoe setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
		return this;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public Shoe setAuthorId(Long authorId) {
		this.authorId = authorId;
		return this;
	}

	public Integer getEvaluationNum() {
		return evaluationNum;
	}

	public Shoe setEvaluationNum(Integer evaluationNum) {
		this.evaluationNum = evaluationNum;
		return this;
	}

	public Integer getUserNum() {
		return userNum;
	}

	public Shoe setUserNum(Integer userNum) {
		this.userNum = userNum;
		return this;
	}

	public Integer getColorNum() {
		return colorNum;
	}

	public Shoe setColorNum(Integer colorNum) {
		this.colorNum = colorNum;
		return this;
	}

	public Integer getHotNum() {
		return hotNum;
	}

	public Shoe setHotNum(Integer hotNum) {
		this.hotNum = hotNum;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.shoeId;
	}

}
