package myproject.beerrestwithbaseauth.beerrestwithbaseauth.mappers;


import myproject.beerrestwithbaseauth.beerrestwithbaseauth.entities.Customer;
import myproject.beerrestwithbaseauth.beerrestwithbaseauth.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
