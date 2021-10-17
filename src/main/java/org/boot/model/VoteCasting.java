package org.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class VoteCasting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // it apply for all db s/w's
    private Integer vid;

    @NonNull
    private String vname;

     @NonNull
    private String address;

    @NonNull
    private String gender;

   @NonNull
    private Integer age;

    public VoteCasting() {

        System.out.println("VoteCasting.VoteCasting 0-param constructor");
    }
}
