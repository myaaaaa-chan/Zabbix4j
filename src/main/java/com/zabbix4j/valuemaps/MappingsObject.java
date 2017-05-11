package com.zabbix4j.valuemaps;


/**
 * Created by 0312birdzhang on 2016/02/19.
 */
public class MappingsObject {

	private Integer mappingid;
	private Integer valuemapid;
	private String value;
	private String newvalue;
	
//	public MappingsObject(){
//		
//	}
	
	public Integer getMappingid() {
		return mappingid;
	}
	public void setMappingid(Integer mappingid) {
		this.mappingid = mappingid;
	}
	public Integer getValuemapid() {
		return valuemapid;
	}
	public void setValuemapid(Integer valuemapid) {
		this.valuemapid = valuemapid;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getNewvalue() {
		return newvalue;
	}
	public void setNewvalue(String newvalue) {
		this.newvalue = newvalue;
	}
	
	
	
}
