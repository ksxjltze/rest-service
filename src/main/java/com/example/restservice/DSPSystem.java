package com.example.restservice;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("dspsystem")
public record DSPSystem(@Id ObjectId id, String name) {
}
