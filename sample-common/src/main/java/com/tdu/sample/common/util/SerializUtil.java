package com.tdu.sample.common.util;

import java.util.concurrent.locks.ReentrantLock;

import org.nustaq.serialization.FSTConfiguration;

/**
 * Fst 序列化与反序列化
 * @author tangdu
 *
 */
public class SerializUtil {

	static final FSTConfiguration CONF = FSTConfiguration.createDefaultConfiguration();
	static final ReentrantLock REENTRANT_LOCK = new ReentrantLock();

	public static Object reSerialize(byte[] bytes) {
		try {
			REENTRANT_LOCK.lock();
			return CONF.asObject(bytes);
		} finally {
			REENTRANT_LOCK.unlock();
		}
	}

	public static byte[] serialize(Object object) {
		try {
			REENTRANT_LOCK.lock();
			return CONF.asByteArray(object);
		} finally {
			REENTRANT_LOCK.unlock();
		}
	}
}
