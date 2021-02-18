package com.demo.service;

import java.util.List;

import com.demo.model.Dricalc;

public interface DricalService {

	List<Dricalc> getdetails();

	void post(Dricalc dricalc);

	Dricalc change(Dricalc dricalc);

	void delete(Integer id);

}
