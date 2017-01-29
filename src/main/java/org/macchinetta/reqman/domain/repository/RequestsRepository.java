package org.macchinetta.reqman.domain.repository;

import java.util.List;

import org.macchinetta.reqman.domain.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(excerptProjection = RequestProjection.class)
public interface RequestsRepository extends CrudRepository<Request, Long> {

	@RestResource(path="requested-by")
	List<Request> findByRequestedById(@Param("id") long id);

}
