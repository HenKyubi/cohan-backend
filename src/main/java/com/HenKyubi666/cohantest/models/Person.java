package com.HenKyubi666.cohantest.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@ToString @EqualsAndHashCode
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter @Column(name="person_id")
	private int id;

	@Getter @Setter @Column(name="person_name")
	private String name;

	@Getter @Setter @Column(name="person_phone_number")
	private String phoneNumber;

	@Getter @Setter @Column(name="person_email_address")
	private String emailAddress;

	@ManyToOne(cascade = {CascadeType.ALL})
	@Getter @Setter
	@JoinColumn(name = "person_address_id") 
	private Address addressId;

	public Person() {
	}
	
}
