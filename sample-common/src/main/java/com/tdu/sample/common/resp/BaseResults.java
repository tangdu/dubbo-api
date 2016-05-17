package com.tdu.sample.common.resp;

public class BaseResults {

	public static <T> Result<T> success(T data) {
		return result(data, BaseStateCode.SUCCESS.getCode(), BaseStateCode.SUCCESS.getText());
	}

	public static <T> Result<T> failure(T data) {
		return result(data, BaseStateCode.FAILURE.getCode(), BaseStateCode.FAILURE.getText());
	}

	public static <T> Result<T> result(T data, int stateCode, String stateText) {
		Result<T> result = new Result<>();
		result.setData(data);
		result.setStateCode(stateCode);
		result.setStateText(stateText);
		return result;
	}

}
