package mate.academy.rickandmorty.dto.internal;

import java.math.BigDecimal;

public record CharacterShortInfoDto(
        BigDecimal id,
        String externalId,
        String name,
        String status,
        String gender
) {
}
