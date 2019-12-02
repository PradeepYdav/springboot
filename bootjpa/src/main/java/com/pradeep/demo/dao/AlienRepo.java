package com.pradeep.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pradeep.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findByAlang(String lang);
	
	List<Alien> findByAidGreaterThan(int aid);

	
	@Query("from Alien where alang=?1 order by aname")
	List<Alien> findByAlangSorted(String lang);
}
