package myproject.beerrestwithbaseauth.beerrestwithbaseauth.mappers;


import myproject.beerrestwithbaseauth.beerrestwithbaseauth.entities.Beer;
import myproject.beerrestwithbaseauth.beerrestwithbaseauth.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
