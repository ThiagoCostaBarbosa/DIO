package kUnitTests.mapper;

import kUnitTests.dto.BeerDTO;
import kUnitTests.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper( BeerMapper.class );

    Beer toModel( BeerDTO beerDTO );

    BeerDTO toDTO( Beer beer );

}
