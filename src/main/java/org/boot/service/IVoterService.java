package org.boot.service;

import org.boot.model.VoteCasting;

public interface IVoterService {


    public String registerTheVoter(VoteCasting voter);

    public Iterable<VoteCasting>  registerAll(Iterable<VoteCasting> vs);

    public VoteCasting displayVoterById(int id);
}
