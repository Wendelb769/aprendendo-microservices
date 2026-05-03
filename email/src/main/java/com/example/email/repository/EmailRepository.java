package com.example.email.repository;

import com.example.email.domain.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
