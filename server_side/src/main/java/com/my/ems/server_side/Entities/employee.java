package com.my.ems.server_side.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.ToString;


@Entity
@ToString
@Table(name="emp_table")
public class employee {
    
     @Id
    @SequenceGenerator(sequenceName = "id_sequence", name = "id_sequence", initialValue = 100)
    @GeneratedValue(generator = "id_sequence", strategy = GenerationType.SEQUENCE)
    private Integer emp_id;
    private String firstName;
    private String lastName;

}
