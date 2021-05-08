package randall.maplestory.world.alliance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import randall.maplestory.repository.AllianceRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JpaAllianceService implements AllianceService {

    private final AllianceRepository repository;

    @Override
    public List<MapleAlliance> loadAll() {
        return repository.findAll().stream()
                .map(MapleAlliance::new)
                .collect(Collectors.toList());
    }
}
