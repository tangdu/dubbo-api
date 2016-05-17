package com.tdu.sample.common.resp;

import java.io.Serializable;
import java.util.Map;

/**
 * 基础类。API响应数据按此约定。需要扩展类皆继承此类
 * 
 * @author tangdu
 *
 * @param <T>
 */
public class Result<T> implements Serializable {

	private static final long serialVersionUID = -2297418698217578499L;
	/** 数据 **/
	private T data;
	/** 状态编号 **/
	private Integer stateCode;
	/** 状态内容 **/
	private String stateText;
	/** 状态编号 **/
	private Map<String, Object> extData;
	
	public Result(){
	}
	
	public Result(T t){
		this.data=t;
		this.stateCode=BaseStateCode.SUCCESS.getCode();
		this.stateText=BaseStateCode.SUCCESS.getText();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getStateCode() {
		return stateCode;
	}

	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateText() {
		return stateText;
	}

	public void setStateText(String stateText) {
		this.stateText = stateText;
	}

	public Map<String, Object> getExtData() {
		return extData;
	}

	public void setExtData(Map<String, Object> extData) {
		this.extData = extData;
	}

}
