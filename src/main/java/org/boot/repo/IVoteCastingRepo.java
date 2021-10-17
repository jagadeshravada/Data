package org.boot.repo;

import org.boot.model.VoteCasting;
import org.springframework.data.repository.CrudRepository;

public interface IVoteCastingRepo extends CrudRepository<VoteCasting,Integer> {


    //if  we want define custom methods then we can decalare  to make our own requirment


}
