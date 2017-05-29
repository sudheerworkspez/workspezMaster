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
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int id;
	@Column(name = "customer_name")
	@NotEmpty(message = "*Please provide an name")
	private String custCutomerName;
	@Column(name = "customer_phone")
	@NotEmpty(message = "*Please provide a phone no")
	private String custMainPhone;
	@Column(name = "customer_bus_reg_num")
	@NotEmpty(message = "*Please provide a business registration number")
	private String custbusinessRegistrationNumber;
	@Column(name = "customer_gst_tax")
	@NotEmpty(message = "*Please provide a gst/taxnumber")
	private String custgstTaxNumber;
	@Column(name = "customer_email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String custMainEmail;
	@Column(name = "customer_website")
	@NotEmpty(message = "*Please provide a website name")
	private String custWebsite;
	@Column(name = "customer_fax")
	@NotEmpty(message = "*Please provide a fax no")
	private String custFax;
	@Column(name = "customer_bill_to")
	@NotEmpty(message = "*Please provide address")
	private String custBillTo;
	@Column(name = "customer_ship_to")
	@NotEmpty(message = "*Please provide address")
	private String custShipTo;
	/*
	 * @Column(name = "customer_phone")
	 * 
	 * @NotEmpty(message = "*Please provide a phone no") private String
	 * custPayment;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustCutomerName() {
		return custCutomerName;
	}

	public void setCustCutomerName(String custCutomerName) {
		this.custCutomerName = custCutomerName;
	}

	public String getCustMainPhone() {
		return custMainPhone;
	}

	public void setCustMainPhone(String custMainPhone) {
		this.custMainPhone = custMainPhone;
	}

	public String getCustbusinessRegistrationNumber() {
		return custbusinessRegistrationNumber;
	}

	public void setCustbusinessRegistrationNumber(String custbusinessRegistrationNumber) {
		this.custbusinessRegistrationNumber = custbusinessRegistrationNumber;
	}

	public String getCustgstTaxNumber() {
		return custgstTaxNumber;
	}

	public void setCustgstTaxNumber(String custgstTaxNumber) {
		this.custgstTaxNumber = custgstTaxNumber;
	}

	public String getCustMainEmail() {
		return custMainEmail;
	}

	public void setCustMainEmail(String custMainEmail) {
		this.custMainEmail = custMainEmail;
	}

	public String getCustWebsite() {
		return custWebsite;
	}

	public void setCustWebsite(String custWebsite) {
		this.custWebsite = custWebsite;
	}

	public String getCustFax() {
		return custFax;
	}

	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}

	public String getCustBillTo() {
		return custBillTo;
	}

	public void setCustBillTo(String custBillTo) {
		this.custBillTo = custBillTo;
	}

	public String getCustShipTo() {
		return custShipTo;
	}

	public void setCustShipTo(String custShipTo) {
		this.custShipTo = custShipTo;
	}

	/*
	 * public String getCustPayment() { return custPayment; }
	 * 
	 * public void setCustPayment(String custPayment) { this.custPayment =
	 * custPayment; }
	 */

}
