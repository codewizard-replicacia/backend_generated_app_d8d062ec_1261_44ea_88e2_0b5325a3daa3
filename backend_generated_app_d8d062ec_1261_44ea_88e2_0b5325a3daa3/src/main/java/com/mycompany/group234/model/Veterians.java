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

@Entity(name = "Veterians")
@Table(name = "\"Veterians\"", schema =  "\"generated_app\"")
@Data
                        
public class Veterians {
	public Veterians () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Vet_Id\"", nullable = true )
  private Integer vet_Id;
	  
  @Column(name = "\"Vet_Name\"", nullable = true )
  private String vet_Name;
  
	  
  @Column(name = "\"Vet_Specialization\"", nullable = true )
  private String vet_Specialization;
  
	  
  @Column(name = "\"Vet_PetAnimal\"", nullable = true )
  private String vet_PetAnimal;
  
	  
  @Column(name = "\"Vet_Description\"", nullable = true )
  private String vet_Description;
  
	  
  @Column(name = "\"Vet_Instagramprofiletofollow\"", nullable = true )
  private String vet_Instagramprofiletofollow;
  
  
  
  
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VeteriansExaminehealth\"",
            joinColumns = @JoinColumn( name="\"Vet_Id\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_Id\""), schema = "\"generated_app\"")
private List<Pet> examinehealth = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Veterians [" 
  + "Vet_Id= " + vet_Id  + ", " 
  + "Vet_Name= " + vet_Name  + ", " 
  + "Vet_Specialization= " + vet_Specialization  + ", " 
  + "Vet_PetAnimal= " + vet_PetAnimal  + ", " 
  + "Vet_Description= " + vet_Description  + ", " 
  + "Vet_Instagramprofiletofollow= " + vet_Instagramprofiletofollow 
 + "]";
	}
	
}