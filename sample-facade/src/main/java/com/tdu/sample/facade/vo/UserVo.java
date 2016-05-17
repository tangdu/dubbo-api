package com.tdu.sample.facade.vo;

import java.io.Serializable;

/**
 * 传递的User对象
 * @author tangdu
 *
 */
public class UserVo implements Serializable {

	private static final long serialVersionUID = 3060159022619895206L;

	/** 主键 **/
	private String id;
	/** 用户名称 **/
	private String uname;
	/** 用户密码 **/
	private String upwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
}
