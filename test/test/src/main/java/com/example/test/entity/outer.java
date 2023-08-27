package com.example.test.entity;

public class outer {
	private String meta;
	private inner data;
	
	@Override
	public String toString() {
		return "outer [meta=" + meta + ", data=" + data + "]";
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public inner getData() {
		return data;
	}
	public void setData(inner data) {
		this.data = data;
	}

}
