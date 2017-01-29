package org.macchinetta.reqman.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Vote {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Organization organization;

	@ManyToOne
	private Request request;

	private int priority;

	private int step;

	private int period;

}
