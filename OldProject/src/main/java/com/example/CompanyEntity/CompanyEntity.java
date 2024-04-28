package com.example.CompanyEntity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tblcompany")
public class CompanyEntity {

	@Id
	@Column(name = "LANG_ID",columnDefinition = "nvarchar(5)")
	private String languageId;

	@Column(name = "LANG_TEXT",columnDefinition = "nvarchar(500)")
	private String languageDescription;
	@Column(name = "IS_DELETED")
	private Long deletionIndicator;

	@Column(name = "REF_FIELD_1",columnDefinition = "nvarchar(200)")
	private String referenceField1;

	@Column(name = "REF_FIELD_2",columnDefinition = "nvarchar(200)")
	private String referenceField2;

	@Column(name = "REF_FIELD_3",columnDefinition = "nvarchar(200)")
	private String referenceField3;

	@Column(name = "REF_FIELD_4",columnDefinition = "nvarchar(200)")
	private String referenceField4;

	@Column(name = "REF_FIELD_5",columnDefinition = "nvarchar(200)")
	private String referenceField5;

	@Column(name = "REF_FIELD_6",columnDefinition = "nvarchar(200)")
	private String referenceField6;

	@Column(name = "REF_FIELD_7",columnDefinition = "nvarchar(200)")
	private String referenceField7;

	@Column(name = "REF_FIELD_8",columnDefinition = "nvarchar(200)")
	private String referenceField8;

	@Column(name = "REF_FIELD_9",columnDefinition = "nvarchar(200)")
	private String referenceField9;

	@Column(name = "REF_FIELD_10",columnDefinition = "nvarchar(200)")
	private String referenceField10;

	@Column(name = "CTD_BY",columnDefinition = "nvarchar(50)")
	private String createdBy;

	@Column(name = "CTD_ON")
	private Date createdOn = new Date();

	@Column(name = "UTD_BY",columnDefinition = "nvarchar(50)")
	private String updatedBy;

	@Column(name = "UTD_ON")
	private Date updatedOn = new Date();
	}

	
	
//@Id
//	@Column(name = "LANG_ID")
//	private String  languageID;
//	@Id
//	@Column(name = "C_ID")
//	private String ComapanyID;
//	
//	@Column(name = "LANG_TEXT")
//	private String languageDescription;
//
//	@Column(name = "C_NAME")
//	private String companyName;
//	
//	@Column(name = "ADDRESS_LINE_1")
//	private String addressLine1;
//	
//	@Column(name = "ADDRESS_LINE_2")
//	private String addressLine2;
//	
//	@Column(name = "ADDRESS_LINE_3")
//	private String addressLine3;
//	
//	@Column(name = "ADDRESS_LINE_4")
//	private String addressLine4;
//	
//	@Column(name = "CITY_ID")
//	private String cityId;
//	
//	@Column(name = "CITY_NAME")
//	private String cityName;
//	
//	@Column(name = "REGION_ID")
//	private String regionId;
//	
//	@Column(name = "REGION_NAME")
//	private String regionName;
//	
//	@Column(name = "COUNTRY_ID")
//	private String countryId;
//	
//	@Column(name = "COUNTRY_NAME")
//	private String countryName;
//	
//	@Column(name = "IS_DELETED")
//	private String deletionIndicator;
//	
//	@Column(name = "REF_FIELD_1")
//	private String referenceField;
//
//	@Column(name = "REF_FIELD_2")
//	private String referenceField2;
//
//	@Column(name = "REF_FIELD_3")
//	private String referenceField3;
//
//	@Column(name = "REF_FIELD_4")
//	private String referenceField4;
//
//@Column(name = "REF_FIELD_5")
//	private String referenceField5;
//
//	@Column(name = "REF_FIELD_6")
//	private String referenceField6;
//
//	@Column(name = "REF_FIELD_7")
//	private String referenceField7;
//
//	@Column(name = "REF_FIELD_8")
//	private String referenceField8;
//
//	@Column(name = "REF_FIELD_9")
//	private String referenceField9;
//
//	@Column(name = "REF_FIELD_10")
//	private String referenceField10;
//
//	@Column(name = "CTD_BY")
//	private String createdBy;
//	
//	@Column(name = "CTD_ON")
//	private Date createdOn = new Date();
//	
//	@Column(name = "UTD_BY")
//	private String updatedBy;
//@Column(name = "UTD_ON") 
//private Date updatedOn = new Date();
//	}	
//	

