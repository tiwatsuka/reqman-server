package org.macchinetta.reqman.domain.repository;

import java.util.Set;

import org.macchinetta.reqman.domain.model.Organization;
import org.macchinetta.reqman.domain.model.Request;
import org.macchinetta.reqman.domain.model.Tag;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="requestProjection", types={Request.class})
public interface RequestProjection {
	
	long getId();

	long getExcelId();

	String getTitle();

	String getDescription();

	boolean isClosed();

	Organization getRequestedBy();
	
	Set<Tag> getTags();
}
