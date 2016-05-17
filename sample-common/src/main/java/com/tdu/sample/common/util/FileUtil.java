package com.tdu.sample.common.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileUtil {

	public static String DEFAULT_ENCODING = "UTF-8";

	private FileUtil() {
	}

	public static void write(File file ,byte[]bytes) throws IOException {
		OutputStream outputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			bufferedOutputStream = new BufferedOutputStream(outputStream);
			bufferedOutputStream.write(bytes);
		} catch (IOException e) {
			throw e;
		} finally {
			if (bufferedOutputStream != null) {
				bufferedOutputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
	
	public static void write(File file, String content) throws IOException {
		write(file, content, DEFAULT_ENCODING);
	}
	
	public static void write(String filePath, String content) throws IOException {
		write(new File(filePath), content, DEFAULT_ENCODING);
	}

	public static void copyFile(InputStream src, File target) throws IOException {
		File parentFile = target.getParentFile();
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		OutputStream os = null;
		byte[] buf = new byte[1024];
		try {
			os = new FileOutputStream(target);
			int read = -1;
			while ((read = src.read(buf)) != -1) {
				os.write(buf, 0, read);
			}
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (src != null)
					src.close();
			} catch (Exception e) {
			}
			try {
				if (os != null)
					os.close();
			} catch (Exception e) {
			}
			buf = null;
		}
	}

	public static void write(File file, String content, String encoding) throws IOException {
		OutputStreamWriter outputStreamWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), encoding);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			bufferedWriter.append(content);
		} catch (IOException e) {
			throw e;
		} finally {
			if (outputStreamWriter != null) {
				bufferedWriter.close();
			}
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}

	public static String read(String file) throws IOException {
		return read(new File(file), DEFAULT_ENCODING);
	}
	
	public static String read(File file) throws IOException {
		return read(file, DEFAULT_ENCODING);
	}

	public static String read(File file, String encoding) throws IOException {
		InputStream inputStream = new FileInputStream(file);
		return read(inputStream, encoding);
	}

	public static String read(InputStream file) throws IOException {
		return read(file, DEFAULT_ENCODING);
	}

	public static String read(InputStream file, String encoding) throws IOException {
		StringBuffer buffer = new StringBuffer();
		InputStreamReader reader = null;
		BufferedReader br = null;
		try {
			reader = new InputStreamReader(file, encoding);
			br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {
				buffer.append(line);
			}
		} catch (IOException e) {
			throw e;
		} finally {
			if (file != null) {
				file.close();
			}
			if (reader != null) {
				reader.close();
			}
			if (br != null) {
				br.close();
			}
		}
		return buffer.toString();
	}
}
