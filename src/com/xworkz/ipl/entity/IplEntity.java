package com.xworkz.ipl.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="ipl")
public class IplEntity {
	@Id
	@Column(name="ipl_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iplId;
	@Column(name="ipl_teamName")
	private String teamName;
	@Column(name="ipl_captain")
	private String captain;
	@Column(name="ipl_sponsor")
	private String sponsor;
	@Column(name="ipl_estDate")
	private LocalDate estDate;
	@Column(name="ipl_budget")
	private long budget;
	public IplEntity(String teamName, String captain, String sponsor, LocalDate estDate, long budget) {
		super();
		this.teamName = teamName;
		this.captain = captain;
		this.sponsor = sponsor;
		this.estDate = estDate;
		this.budget = budget;
	}
	
	

}
