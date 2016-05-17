package com.tdu.sample.common.req;

import java.io.Serializable;
import java.util.List;

public class Page<T extends Serializable> implements Serializable {
	private static final long serialVersionUID = -4427454827005469854L;
	/** 总记录数 **/
	private long totalCount;
	/** 总页数 **/
	private int totalPage;
	/** 每页大小 **/
	private int pageSize;
	/** 第几页 **/
	private int pageNo;
	/** 结果集 **/
	private List<T> results;

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

}
