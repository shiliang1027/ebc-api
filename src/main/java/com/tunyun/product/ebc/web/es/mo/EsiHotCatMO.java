package com.tunyun.product.ebc.web.es.mo;

public class EsiHotCatMO {

	// 品类id
	private long cid;

	// 资讯id
	private long info_id;

	// 资讯信息
	private String title;

	// 阅读数量
	private long readNum;

	public long getInfo_id() {
		return info_id;
	}

	public void setInfo_id(long info_id) {
		this.info_id = info_id;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getReadNum() {
		return readNum;
	}

	public void setReadNum(long readNum) {
		this.readNum = readNum;
	}

	/**
	 * 获取表格信息
	 * @return
	 */
	public String getTableStr(){
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append("\"title\": \"").append(title).append("\",");
		sb.append("\"uid\": \"").append(info_id).append("\",");
		sb.append("\"read_num\": ").append(readNum);
		sb.append("}");
		
		return sb.toString();
	}
}
