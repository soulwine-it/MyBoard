package com.board.domain;

public class Criteria {
	private int page;
	private int perPageNum;
	private int rowStart;
	private int rowEnd;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public void setPage(int page) {
		//페이지가 없다면 1페이지로하고
		if(page <= 0)
		{
			this.page = 1;
			return;
		}
		//페이지가 1보다 높다면 그 페이지를 들어온 페이지로 바꾼다.
		this.page = page;
	}
	//페이지당 글 개수 출력
	public void setPerPageNum(int perPageNum) {
		//페이지당 출력개수가 0보다 작거나 100보다 크다면 기본 페이지당 출력 개수는 10으로 한다.
		if(perPageNum <= 0 || perPageNum > 100 ) {
			this.perPageNum = 10;
			return;
		}
		//그러나 페이지당 1~100 사이라면 그 숫자를 따른다.
		this.perPageNum = perPageNum;
	}
	
	//요청된 페이지 값을 받아온다
	public int getPage() {
		return page;
	}
	
	// 시작하는 페이지
	public int getPageStart() {
		
		return (this.page -1) * perPageNum;
	}
	
	//페이지당 개수
	public int getPerPageNum() {
		return this.perPageNum;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ""
				+ ", rowStart=" + getRowStart() + ", rowEnd=" + getRowEnd() + "]";
	}
	
	public int getRowStart() {
		rowStart = ((page - 1) * perPageNum)+1;
		return rowStart;
	}
	
	public int getRowEnd() {
		rowEnd = rowStart + perPageNum -1;
		return rowEnd;
		
	}
}
