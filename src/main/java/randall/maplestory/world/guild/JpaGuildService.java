package randall.maplestory.world.guild;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import randall.maplestory.repository.GuildRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JpaGuildService implements GuildService {

    private final GuildRepository repository;

    @Override
    public List<MapleGuild> loadAll() {
        return repository.findAll().stream()
                .map(MapleGuild::new)
                .collect(Collectors.toList());
    }
}
