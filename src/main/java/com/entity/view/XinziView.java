package com.entity.view;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 薪资
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinzi")
public class XinziView extends XinziEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否确认的值
		*/
		private String xinziYesnoValue;



		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;

	public XinziView() {

	}

	public XinziView(XinziEntity xinziEntity) {
		try {
			BeanUtils.copyProperties(this, xinziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否确认的值
			*/
			public String getXinziYesnoValue() {
				return xinziYesnoValue;
			}
			/**
			* 设置： 是否确认的值
			*/
			public void setXinziYesnoValue(String xinziYesnoValue) {
				this.xinziYesnoValue = xinziYesnoValue;
			}














				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}


}
