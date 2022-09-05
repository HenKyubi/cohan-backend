package com.HenKyubi666.cohantest.models;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "addresses")
@ToString @EqualsAndHashCode
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter @Column(name="address_id")
	private int id;

	@Getter @Setter @Column(name="address_street")
	private int street;

	@Getter @Setter @Column(name="address_city")
	private String city;

	@Getter @Setter @Column(name="address_state")
	private String state;

	@Getter @Setter @Column(name="address_postal_code")
	private int postalCode;

	@Getter @Setter @Column(name="address_country")
	private String country;

	public Address() {
	}
	
}
