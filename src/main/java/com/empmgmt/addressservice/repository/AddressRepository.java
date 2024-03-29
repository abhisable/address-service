package com.empmgmt.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empmgmt.addressservice.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity,Integer> {

	@Query(nativeQuery=true,value="select ea.id,ea.lane1,ea.lane2,ea.zip,ea.state from empmgmt.address ea join empmgmt.employee e on e.id=ea.employee_id where ea.employee_id=:employeeId")
	AddressEntity findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
