package org.abhi.myservice.vo;

public class DataVO {
	private String id;
	private String payload;
	public DataVO() {
		super();
	}
	public DataVO(String id, String payload) {
		super();
		this.id = id;
		this.payload = payload;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
}
