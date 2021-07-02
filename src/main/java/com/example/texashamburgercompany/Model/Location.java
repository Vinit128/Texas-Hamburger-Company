package com.example.texashamburgercompany.Model;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Location {

    @Id
    private String Id;
 private String locationName;
 private String state;
 private String city;
 private int zip;


      public Location(String id, String locationName, String state, String city, int zip) {
        this.Id= UUID.randomUUID().toString();
        this.locationName = locationName;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }


}














//@Data will generate getters , setters , default constructor