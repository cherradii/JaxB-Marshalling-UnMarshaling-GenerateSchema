package cherradi.bo;

import java.nio.file.AccessMode;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name = "cp")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
	
	@XmlAttribute(name = "id")
	private Long code;
	@XmlElement
	private double solde;
	private Date dateCreation;
	@XmlTransient
	private String full_name;
	
	
	public Compte() {

	}

	public Compte(Long code, double solde, Date dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	
	public Compte(Long code, double solde, Date dateCreation, String full_name) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.full_name = full_name;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}
