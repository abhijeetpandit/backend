package org.abhi.myservice.vo;

import java.util.ArrayList;
import java.util.List;

public class DataResponse {
	private List<DataVO> data = new ArrayList<>();

	public List<DataVO> getData() {
		return data;
	}

	public void setData(List<DataVO> data) {
		this.data = data;
	}
}
