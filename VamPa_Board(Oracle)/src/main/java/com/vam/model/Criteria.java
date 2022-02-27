package com.vam.model;

import lombok.Data;

@Data
public class Criteria {
    /* 현재 페이지 */
    private int pageNum;
    
    /* 한 페이지 당 보여질 게시물 갯수 */
    private int amount;
    /*검색키워드*/
    private String keyword;
    /* 기본 생성자 -> 기봅 세팅 : pageNum = 1, amount = 10 */
    public Criteria() {
        this(1,10);
    }
    
    /* 생성자 => 원하는 pageNum, 원하는 amount */
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
    private String type;
    /* 검색 타입 배열 */
    private String[] typeArr;
    public void setType(String type) {
    	this.type = type;
    	this.typeArr =type.split("");
    }
    @Override
    public String toString() {
    	return "Criteria [pageNum=" + pageNum + ", amount=" + amount +"]";
    }
}
