package com.tdu.sample.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;

/**
 * Java 属性复制工具类
 * @author tangdu
 *
 */
public class CopyUtil {

	public static <T> T copyByBean(Object obj, Class<T> clz) {
		if (obj instanceof Collection) {
			return null;
		}
		T t = BeanUtils.instantiate(clz);
		BeanUtils.copyProperties(obj, t);
		return t;
	}

	public static <T> List<T> copyByList(List<?> list, Class<T> clz) {
		List<T> result = new ArrayList<>();
		for (Object obj : list) {
			result.add(copyByBean(obj, clz));
		}
		return result;
	}

	public static <T> T copyByBean(Object obj, Class<T> clz, String... ignores) {
		T t = BeanUtils.instantiate(clz);
		BeanUtils.copyProperties(clz, t, ignores);
		return t;
	}

	public static Object copyObject(Object source) throws Exception {
		if (source == null) {
			return null;
		}
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(source);
		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		return in.readObject();
	}

}
