package com.HenKyubi666.cohantest.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "students")
@ToString @EqualsAndHashCode
public class Student {


  @Id
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="student_person_id")
  @Getter @Setter
  private Person personId;
  
  @Getter @Setter @Column(name="student_number")
  private int number;

  @Getter @Setter @Column(name="student_average_mark")
  private double averageMark;

  public Student (){}


}
