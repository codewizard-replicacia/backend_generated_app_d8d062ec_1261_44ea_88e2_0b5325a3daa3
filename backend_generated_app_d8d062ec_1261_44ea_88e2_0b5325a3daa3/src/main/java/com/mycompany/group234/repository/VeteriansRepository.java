package com.mycompany.group234.repository;


import com.mycompany.group234.model.Veterians;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VeteriansRepository extends SimpleJpaRepository<Veterians, String> {
    private final EntityManager em;
    public VeteriansRepository(EntityManager em) {
        super(Veterians.class, em);
        this.em = em;
    }
    @Override
    public List<Veterians> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Veterians\"", Veterians.class).getResultList();
    }
}