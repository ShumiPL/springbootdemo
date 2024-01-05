package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Lamp;

@Repository
public interface LampRepository extends JpaRepository<Lamp, Long>
{

}
