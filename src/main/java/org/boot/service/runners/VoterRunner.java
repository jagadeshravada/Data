package org.boot.service.runners;

import org.boot.model.VoteCasting;
import org.boot.service.IVoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VoterRunner implements ApplicationRunner {

     @Autowired
    private IVoterService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

          try{
            /*  VoteCasting vo = new VoteCasting();
              vo.setVname("rama devi ravada");
              vo.setAge(30);
              vo.setAddress("komallapudi");
              vo.setGender("Female");
              System.out.println(service.registerTheVoter(vo));*/
                 /*  Iterable<VoteCasting>  vs=service.registerAll(List.of(new VoteCasting("boddu avatharam","thanam","Male",38),
                            new VoteCasting("boddu Devi","thanam","Female",34),
                            new VoteCasting("boddu Jenamma","Jaggayyapeta","Female",70)));

                   vs.forEach(voter-> System.out.println(voter.getVid()));*/
              System.out.println(service.displayVoterById(10));

          }
          catch (DataAccessException de){

              System.out.println(de.getMessage());
          }


    }
}
