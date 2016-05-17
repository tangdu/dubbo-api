package com.tdu.sample.common.resp;

public enum BaseStateCode {
	SUCCESS(1,"成功"),
	FAILURE(0,"失败"),
	ILLEGAL_PARAMS(-100,"无效的参数"),
	PARSE_PARAMS(-101,"参数解析失败"),
	LOST_PARAMS(-102,"参数缺失"),
	ILLEGAL_TOKEN(-103,"无效请求标识"),
	EMPTY_DATA(-104,"返回空数据"),
	ILLEGAL_SIGN(-200,"无效签名"),
	REQUEST_TIMEOUT(-201,"请求超时"),
	RESPONSE_TIMEOUT(-202,"响应超时"),
	DB_ERROR(-203,"数据库异常"),
	INTEL_ERROR(-204,"网络异常"),
	;
	private Integer code;
	private String text;

	private BaseStateCode(Integer code, String text) {
		this.code = code;
		this.text = text;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
