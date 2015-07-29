package com.paypal.compliance.domain.repositories;

import com.paypal.compliance.domain.Disclosure;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisclosureRepository extends CrudRepository<Disclosure, Long> {

	Disclosure findByKey(Long Key);
	Disclosure findByCaseIdentifier(String caseIdentifier);
}
