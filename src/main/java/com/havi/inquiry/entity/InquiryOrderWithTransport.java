package com.havi.inquiry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

public class InquiryOrderWithTransport extends InquiryOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
}
