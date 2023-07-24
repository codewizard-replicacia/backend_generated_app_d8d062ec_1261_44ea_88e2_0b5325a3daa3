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

@Entity(name = "Pet")
@Table(name = "\"Pet\"", schema =  "\"generated_app\"")
@Data
                        
public class Pet {
	public Pet () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Pet_Id\"", nullable = true )
  private Integer pet_Id;
	  
  @Column(name = "\"Pet_Name\"", nullable = true )
  private String pet_Name;
  
	  
  @Column(name = "\"Pet_Category\"", nullable = true )
  private String pet_Category;
  
	  
  @Column(name = "\"Pet_Species\"", nullable = true )
  private String pet_Species;
  
	  
  @Column(name = "\"Pet_Age\"", nullable = true )
  private String pet_Age;
  
	  
  @Column(name = "\"Pet_Gender\"", nullable = true )
  private String pet_Gender;
  
  
  
  
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetOwns\"",
            joinColumns = @JoinColumn( name="\"Pet_Id\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_OwnerId\""), schema = "\"generated_app\"")
private List<PetOwner> owns = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Pet [" 
  + "Pet_Id= " + pet_Id  + ", " 
  + "Pet_Name= " + pet_Name  + ", " 
  + "Pet_Category= " + pet_Category  + ", " 
  + "Pet_Species= " + pet_Species  + ", " 
  + "Pet_Age= " + pet_Age  + ", " 
  + "Pet_Gender= " + pet_Gender 
 + "]";
	}
	
}