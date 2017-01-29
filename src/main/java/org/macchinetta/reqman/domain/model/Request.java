package org.macchinetta.reqman.domain.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Request {

	@Id
	@GeneratedValue
	private long id;

	private long excelId;
	
	private String title;
	
	@Lob
	private String description;
	
	private boolean isClosed;
	
	@ManyToOne
	private Organization requestedBy;

	@ManyToMany
	private Set<Tag> tags;
}
