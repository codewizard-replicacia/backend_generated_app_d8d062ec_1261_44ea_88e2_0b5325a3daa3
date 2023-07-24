package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Pet;
import com.mycompany.group234.model.PetOwner;
import com.mycompany.group234.model.Veterians;

@Entity(name = "PetOwnerBookAppointmentScheduleVisitVaccine")
@Table(schema = "\"generated_app\"", name = "\"PetOwnerBookAppointmentScheduleVisitVaccine\"")
@Data
public class PetOwnerBookAppointmentScheduleVisitVaccine{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_OwnerId\"")
	private Integer pet_OwnerId;

    
    @Column(name = "\"Vet_Id\"")
    private Integer vet_Id;
 
}