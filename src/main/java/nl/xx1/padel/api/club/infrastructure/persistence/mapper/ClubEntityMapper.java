package nl.xx1.padel.api.club.infrastructure.persistence.mapper;

import nl.xx1.padel.api.club.domain.Club;
import nl.xx1.padel.api.club.infrastructure.persistence.entity.ClubEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClubEntityMapper {
  ClubEntityMapper INSTANCE = Mappers.getMapper(ClubEntityMapper.class);

  Club toDomain(ClubEntity clubEntity);
  ClubEntity toEntity(Club club);
}
