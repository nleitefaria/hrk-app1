package com.mycompany.hrkapp1.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "video_movies")
public class VideoMovies {

	@Id
	public ObjectId _id;
	public String title;
	public Integer year;
	public String imdb;
	public String type;

	public VideoMovies() {
	}

	public String get_id() {
		return this._id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}