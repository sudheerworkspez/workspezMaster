package com.workspez.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "vendor")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vendor_id")
	private String id;
	@Column(name = "vendor_comp_name")
	@NotEmpty(message = "*Please provide a company name")
	private String vendCompanyName;
	@Column(name = "phone_no")
	@NotEmpty(message = "*Please provide a phone no")
	private String vendMainPhone;
	@Column(name = "business_reg_no")
	@NotEmpty(message = "*Please provide a business reg no")
	private String vendBusinessRegistrationNumber;
	@Column(name = "tax_no")
	@NotEmpty(message = "*Please provide a tax no")
	private String vendgstTaxNumber;
	@Column(name = "email_id")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String vendmainEmail;
	@Column(name = "website")
	@NotEmpty(message = "*Please provide a website")
	private String vendwebSite;
	@Column(name = "bill_to")
	@NotEmpty(message = "*Please provide an address")
	private String vendbillTo;
	@Column(name = "ship_to")
	@NotEmpty(message = "*Please provide an address")
	private String vendshipTo;
	 private String vendPayment; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVendCompanyName() {
		return vendCompanyName;
	}

	public void setVendCompanyName(String vendCompanyName) {
		this.vendCompanyName = vendCompanyName;
	}

	public String getVendMainPhone() {
		return vendMainPhone;
	}

	public void setVendMainPhone(String vendMainPhone) {
		this.vendMainPhone = vendMainPhone;
	}

	public String getVendBusinessRegistrationNumber() {
		return vendBusinessRegistrationNumber;
	}

	public void setVendBusinessRegistrationNumber(String vendBusinessRegistrationNumber) {
		this.vendBusinessRegistrationNumber = vendBusinessRegistrationNumber;
	}

	public String getVendgstTaxNumber() {
		return vendgstTaxNumber;
	}

	public void setVendgstTaxNumber(String vendgstTaxNumber) {
		this.vendgstTaxNumber = vendgstTaxNumber;
	}

	public String getVendmainEmail() {
		return vendmainEmail;
	}

	public void setVendmainEmail(String vendmainEmail) {
		this.vendmainEmail = vendmainEmail;
	}

	public String getVendwebSite() {
		return vendwebSite;
	}

	public void setVendwebSite(String vendwebSite) {
		this.vendwebSite = vendwebSite;
	}

	public String getVendbillTo() {
		return vendbillTo;
	}

	public void setVendbillTo(String vendbillTo) {
		this.vendbillTo = vendbillTo;
	}

	public String getVendshipTo() {
		return vendshipTo;
	}

	public void setVendshipTo(String vendshipTo) {
		this.vendshipTo = vendshipTo;
	}

	/*
	 * public String getVendPayment() { return vendPayment; }
	 * 
	 * public void setVendPayment(String vendPayment) { this.vendPayment =
	 * vendPayment; }
	 */

}
