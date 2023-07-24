package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Pet;
import com.mycompany.group234.model.PetOwner;
import com.mycompany.group234.model.Veterians;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PetOwner")
@Table(name = "\"PetOwner\"", schema =  "\"generated_app\"")
@Data
                        
public class PetOwner {
	public PetOwner () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Pet_OwnerId\"", nullable = true )
  private Integer pet_OwnerId;
	  
  @Column(name = "\"Pet_OwnerName\"", nullable = true )
  private String pet_OwnerName;
  
	  
  @Column(name = "\"Pet_OwnerPhNumber\"", nullable = true )
  private Long pet_OwnerPhNumber;
  
  
  
  
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetOwnerBookAppointmentScheduleVisitVaccine\"",
            joinColumns = @JoinColumn( name="\"Pet_OwnerId\""),
            inverseJoinColumns = @JoinColumn( name="\"Vet_Id\""), schema = "\"generated_app\"")
private List<Veterians> bookAppointmentScheduleVisitVaccine = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PetOwner [" 
  + "Pet_OwnerId= " + pet_OwnerId  + ", " 
  + "Pet_OwnerName= " + pet_OwnerName  + ", " 
  + "Pet_OwnerPhNumber= " + pet_OwnerPhNumber 
 + "]";
	}
	
}