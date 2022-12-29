package com.havi.inquiry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class InquiryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long farmerId;
    private String payment;
    private String paymentStatus;
    private String address;
    private LocalDateTime time;
    private String email;
    private String customerStatus;
    private LocalDateTime customerReceiveTime;
    private Long orderCode;
    private String farmerGivenStatus;
    private Long contact;
    private Integer quantity;

}
