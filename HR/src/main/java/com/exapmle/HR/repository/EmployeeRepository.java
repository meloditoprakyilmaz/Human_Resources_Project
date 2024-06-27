package com.exapmle.HR.repository;

import com.exapmle.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Bu anatasyon, bu sınıfın bir Spring veritabanı deposu olduğunu belirtir.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

// JPA-->CRUD işlemleri için gerekli metotları sağlar.
//Programlamada oluşturma, okuma, güncelleme ve silme (İngilizce: Create, Read, Update, Delete (CRUD))