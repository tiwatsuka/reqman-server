package org.macchinetta.reqman.domain.repository;

import org.macchinetta.reqman.domain.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TagsRepository extends CrudRepository<Tag, Long> {

}
