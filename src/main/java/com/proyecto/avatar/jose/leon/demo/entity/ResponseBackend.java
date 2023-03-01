package com.proyecto.avatar.jose.leon.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBackend {
	
	private Integer count;
	private String next;
	private String previous;
	private List<Pelicula> results;
	
	public ResponseBackend() {

	}
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<Pelicula> getResults() {
		return results;
	}
	public void setResults(List<Pelicula> results) {
		this.results = results;
	}
	
	
}
