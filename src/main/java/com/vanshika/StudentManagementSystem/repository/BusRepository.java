package com.vanshika.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vanshika.StudentManagementSystem.Entity.Bus;


@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{
	

	@Query("select a FROM Bus a WHERE a.bus_rout =:bus_rout")
	public List<Bus> getStudentbyBusRoute(@Param("bus_rout") String bus_rout);

}
