package com.Bridgelabz.SpringBatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public  class User
{
    @Id
    private int userId;
    private String firstName;
    private String lastName;
}
