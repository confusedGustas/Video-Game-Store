package com.gustas.videogamestore.mapper;

import com.gustas.videogamestore.domain.Game;
import com.gustas.videogamestore.domain.Genre;
import com.gustas.videogamestore.domain.Platform;
import com.gustas.videogamestore.domain.Publisher;
import com.gustas.videogamestore.domain.Region;
import com.gustas.videogamestore.dto.request.GameRequestDto;
import com.gustas.videogamestore.dto.response.GameResponseDto;

import java.util.Collections;
import java.util.List;

public class GameMapper {

    private GameMapper() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    public static Game toEntity(GameRequestDto gameRequestDto,
                                Genre genre,
                                Platform platform,
                                Region region,
                                Publisher publisher) {
        Game game = new Game();

        game.setName(gameRequestDto.getName());
        game.setPrice(gameRequestDto.getPrice());
        game.setReleaseYear(gameRequestDto.getReleaseYear());
        game.setGenre(genre);
        game.setActivationPlatform(platform);
        game.setStock(gameRequestDto.getStock());
        game.setDescription(gameRequestDto.getDescription());
        game.setActivationRegion(region);
        game.setPublisher(publisher);

        return game;
    }

    public static GameResponseDto toDto(Game game) {
        GameResponseDto dto = new GameResponseDto();

        dto.setId(game.getId());
        dto.setName(game.getName());
        dto.setPrice(game.getPrice());
        dto.setReleaseYear(game.getReleaseYear());
        dto.setGenre(game.getGenre());
        dto.setActivationPlatform(game.getActivationPlatform());
        dto.setStock(game.getStock());
        dto.setDescription(game.getDescription());
        dto.setActivationRegion(game.getActivationRegion());
        dto.setPublisher(game.getPublisher());
        dto.setSeller(game.getUser().getUsername());

        return dto;
    }

    public static List<GameResponseDto> toDto(List<Game> games) {
        if (games == null || games.isEmpty()) {
            return Collections.emptyList();
        }

        return games.stream()
                .map(GameMapper::toDto)
                .toList();
    }

}
