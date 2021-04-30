package randall.maplestory.world.family;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import randall.maplestory.repository.FamilieRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JpaFamilyService implements FamilyService {

    private final FamilieRepository repository;

    @Override
    public List<MapleFamily> loadAll() {
        return repository.findAll().stream()
                .map(MapleFamily::new)
                .collect(Collectors.toList());
    }
}
