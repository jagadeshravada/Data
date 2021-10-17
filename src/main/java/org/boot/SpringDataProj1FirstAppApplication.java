package org.boot;

import org.boot.model.VoteCasting;
import org.boot.service.IVoterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

@SpringBootApplication
public class SpringDataProj1FirstAppApplication {

    public static void main(String[] args) {


                 SpringApplication.run(SpringDataProj1FirstAppApplication.class, args);

     /*   ApplicationContext ctx;
          try {
              IVoterService voter = ctx.getBean("voter", IVoterService.class);
              VoteCasting vo = new VoteCasting();
              vo.setVname("rama devi ravada");
              vo.setAge(30);
              vo.setAddress("komallapudi");
              vo.setGender("Female");
              System.out.println(voter.registerTheVoter(vo));
          }catch (DataAccessException de){
              System.out.println(de.getMessage());
          }

          ((ConfigurableApplicationContext) ctx).close();*/

    }

}
