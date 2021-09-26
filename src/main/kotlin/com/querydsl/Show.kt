package com.querydsl

import com.querydsl.core.annotations.QueryEntity
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@QueryEntity // this is required otherwise querydsl won't generate Qclass
@Document
data class Show(
    @Id
    val id: String,
    val title: String,
    val releaseYear: Int
)