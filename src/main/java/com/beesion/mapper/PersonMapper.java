package com.beesion.mapper;


import com.beesion.dto.PersonDto;
import com.beesion.model.Person;

public class PersonMapper {

    public static PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.id = person.getId();
        dto.name = person.getName();
        return dto;
    }

    public static Person toEntity(PersonDto dto) {
        return new Person(dto.name);
    }
}
