package com.Geekster.User_Management_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private Integer UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String PhoneNumber;

}
