package org.macchinetta.reqman.domain.repository;

import org.macchinetta.reqman.domain.model.Organization;
import org.macchinetta.reqman.domain.model.Request;
import org.macchinetta.reqman.domain.model.Vote;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="voteProjection", types=Vote.class)
public interface VoteProjection {
	long getId();

	Organization getOrganization();

	Request getRequest();

	int getPriority();

	int getStep();

	int getPeriod();
}
