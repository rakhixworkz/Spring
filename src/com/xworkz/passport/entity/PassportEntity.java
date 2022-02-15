package com.xworkz.passport.entity;
	import java.time.LocalDateTime;
	import java.util.Date;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Table;
	import com.xworkz.passport.constants.BloodGroup;
	import com.xworkz.passport.constants.Gender;
	import com.xworkz.passport.constants.PassportPersonnelType;
	import com.xworkz.passport.constants.VerifiedDocument;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	@Data
	@NoArgsConstructor
	@Entity
	@Table(name = "passport_entity")
	public class PassportEntity {
		@Column(name = "p_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "p_issuedBy")
		private String issuedBy;
		@Column(name = "p_issuedAt")
		private LocalDateTime issuedAt;
		@Column(name = "p_expiresAt")
		private LocalDateTime expiresAt;
		@Column(name = "p_gender")
		private Gender gender;
		@Column(name = "p_passportNumber")
		private String passportNo;
		@Column(name = "p_address")
		private String address;
		@Column(name = "p_fName")
		private String fName;
		@Column(name = "p_legalIssue")
		private boolean legalIssue;
		@Column(name = "p_passportpersonneltype")
		private PassportPersonnelType passportpersonneltype;
		@Column(name = "p_dob")
		private Date dob;	
		@Column(name = "p_bloodgrop")
		private BloodGroup bloodgrop;
		@Column(name = "p_verifiedDocument")
		private VerifiedDocument verifiedDocument;
		
		public PassportEntity(String issuedBy, LocalDateTime issuedAt, LocalDateTime expiresAt, Gender gender,
				String passportNo, String address, String fName, boolean legalIssue,
				PassportPersonnelType passportpersonneltype, Date dob, BloodGroup bloodgrop,
				VerifiedDocument verifiedDocument) {
			super();
			this.issuedBy = issuedBy;
			this.issuedAt = issuedAt;
			this.expiresAt = expiresAt;
			this.gender = gender;
			this.passportNo = passportNo;
			this.address = address;
			this.fName = fName;
			this.legalIssue = legalIssue;
			this.passportpersonneltype = passportpersonneltype;
			this.dob = dob;
			this.bloodgrop = bloodgrop;
			this.verifiedDocument = verifiedDocument;
		}

		public PassportEntity(String issuedBy2, LocalDateTime now, LocalDateTime now2, char c, String passportNo2,
				String address2, String fName2, boolean legalIssue2, String string, String string2, String string3,
				String string4) {
			// TODO Auto-generated constructor stub
		}
		
	}
