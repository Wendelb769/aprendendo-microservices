package com.example.email.domain;

import com.example.email.enums.EmailStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EMAIL")
@Data
public class EmailModel {
    private String emailId;
    private String userId;
    private String emailTo;
    private String emailFrom;
    private String emailSubject;
    @Column(columnDefinition = "BODY")
    private String emailBody;
    private LocalDateTime emailSentDate;
    private EmailStatus statusEmail;
}
