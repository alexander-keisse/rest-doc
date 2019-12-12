package org.rastalion.restdoc.web.mappers;

import org.mapstruct.Mapper;
import org.rastalion.restdoc.domain.Beer;
import org.rastalion.restdoc.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
