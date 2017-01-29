package org.macchinetta.reqman.domain.repository;

import java.util.List;

import org.macchinetta.reqman.domain.model.Vote;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(excerptProjection=VoteProjection.class)
public interface VotesRepository extends PagingAndSortingRepository<Vote, Long> {

	@RestResource(path="period")
	List<Vote> findByPeriod(@Param("period") int period);

	@RestResource(path="step")
	List<Vote> findByStepBetweenAndPeriod(@Param("min") int min, @Param("max") int max, @Param("period") int period);

	@RestResource(path="organization")
	List<Vote> findByOrganizationId(@Param("id") long organizationId);

	@RestResource(path="request")
	List<Vote> findByRequestId(@Param("id") long requestId);

	@RestResource(path="tag")
	List<Vote> findByRequestTagsName(@Param("name") String tagName);
}
