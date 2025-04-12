package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.external.CharacterModelDto;
import mate.academy.rickandmorty.model.CharacterModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class, uses = {LocationMapper.class, OriginMapper.class})
public interface CharacterMapper {
    @Mapping(source = "id", target = "externalId")
    CharacterModel toModel(CharacterModelDto characterModelDto);
}
