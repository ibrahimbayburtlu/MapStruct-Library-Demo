package com.ibrahimbayburtlu.MapStructLibrary.mapper;

import com.ibrahimbayburtlu.MapStructLibrary.dto.CustomerDTO;
import com.ibrahimbayburtlu.MapStructLibrary.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "ID", target = "ID") // --> 1
    @Mapping(source = "name", target = "name") // --> 1
    @Mapping(source = "phoneNumber",target = "phoneNumber",qualifiedByName = "stringToLong") // --> 2
    @Mapping(source = "customerStatus", target = "customerStartedStatus") // --> 3
    CustomerDTO customerToCustomerDTO(Customer customer);

    @Mapping(source = "ID",target = "ID") // -->  1
    @Mapping(source = "name", target = "name") // --> 1
    @Mapping(source = "customerStartedStatus", target = "customerStatus") // --> 2
    @Mapping(source = "phoneNumber", target = "phoneNumber", qualifiedByName = "longToString") // --> 3
    Customer customerDTOToCustomer(CustomerDTO customerDTO);


    @Named("stringToLong")
    default Long stringToLong(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("\\s+", "").replaceAll("-", "");
        return Long.parseLong(phoneNumber);
    }
    @Named("longToString")
    default String longToString(Long phoneNumber){
        return phoneNumber.toString();
    }
}
