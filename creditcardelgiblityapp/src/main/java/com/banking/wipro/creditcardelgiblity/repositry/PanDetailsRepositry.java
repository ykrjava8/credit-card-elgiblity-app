package com.banking.wipro.creditcardelgiblity.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.wipro.creditcardelgiblity.entity.PanDetails;
@Repository

public interface PanDetailsRepositry extends JpaRepository<PanDetails, String> {

}
