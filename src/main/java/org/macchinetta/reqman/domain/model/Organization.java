package org.macchinetta.reqman.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Organization {

	@Id
	@GeneratedValue
	private long id;

	private String name;

}
