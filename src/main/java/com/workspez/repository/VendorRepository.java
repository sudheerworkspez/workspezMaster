package com.workspez.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.workspez.model.Vendor;

/*@Repository("vendorRepository")*/
public interface VendorRepository  {
//extends JpaRepository<Vendor, Long>

	/*@Query(value = "from Vendor v where v.vendCompName=?1")
	public Vendor findVendorCompName(String vendorCompName);*/
}
