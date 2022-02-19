package com.xworkz.coffeeDay.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
@Table(name="coffeeDay")
public class CoffeeDayEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_id")
	private int cId;
	@Column(name="cd_location")
	private String location;
	@Column(name="cd_frenchiseOwner")
	private String frenchiseOwner;
	@Column(name="cd_startDate")
	private LocalDate startDate;
	@Column(name="cd_openTime")
	private LocalDateTime openTime;
	@Column(name="cd_closeTime")
	private LocalDateTime closeTime;
	public CoffeeDayEntity(String location, String frenchiseOwner, LocalDate startDate, LocalDateTime openTime,
			LocalDateTime closeTime) {
		super();
		this.location = location;
		this.frenchiseOwner = frenchiseOwner;
		this.startDate = startDate;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	

}
