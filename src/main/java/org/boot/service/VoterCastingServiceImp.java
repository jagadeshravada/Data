package org.boot.service;

import org.boot.model.VoteCasting;
import org.boot.repo.IVoteCastingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("voter")
public class VoterCastingServiceImp implements IVoterService{

    @Autowired
    private IVoteCastingRepo repo;


    @Override
    public String registerTheVoter(VoteCasting voter) {

        System.out.println("VoterCastingServiceImp.registerTheVoter"+ repo.getClass());
            if(voter!=null)
                return "Voter casted vote successfully::"+repo.save(voter).getVid();
            else
                return "Vote is failed to cast::";
    }

    @Override
    public Iterable<VoteCasting> registerAll(Iterable<VoteCasting> vs) {
        if(vs!=null)

            return   repo.saveAll(vs);

        else
             throw new IllegalArgumentException("failed to insert the bulk records");
    }

    @Override
    public VoteCasting displayVoterById(int id) {
       Optional<VoteCasting> vc= repo.findById(id);
       if(vc.isPresent())
        return vc.get();

       return vc.orElseThrow(()->new IllegalArgumentException("Voter not casted the vote"+vc.get().getVid()));
    }


}
