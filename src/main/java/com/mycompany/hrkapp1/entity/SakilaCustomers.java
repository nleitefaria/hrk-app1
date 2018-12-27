package com.mycompany.hrkapp1.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sakila_customers")
public class SakilaCustomers {

	@Id
	public Integer _id;
	public String address;

	public SakilaCustomers() {
	}

	public SakilaCustomers(Integer _id, String address) 
	{	
		this._id = _id;
		this.address = address;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}