package randall.maplestory.world.party;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.repository.CharacterRepository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@RequiredArgsConstructor
public class PartyManage {

    // todo 应该是有个组队表，里面是 member List，然后归到这个 Map 中。
    private final Map<Integer, MapleParty> parties = new ConcurrentHashMap<>();
    private final AtomicInteger runningPartyId = new AtomicInteger();

    private final CharacterRepository characterRepository;

    @PostConstruct
    public void init() {
        characterRepository.findMaxParty()
                .ifPresent(character -> runningPartyId.set(character.getParty()));
    }

    public MapleParty getParty(int id) {
        return parties.get(id);
    }
}
