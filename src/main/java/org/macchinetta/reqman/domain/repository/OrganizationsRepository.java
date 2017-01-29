package org.macchinetta.reqman.domain.repository;

import org.macchinetta.reqman.domain.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface OrganizationsRepository extends CrudRepository<Organization, Long>{

}
