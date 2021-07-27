package randall.maplestory.world;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;
import randall.maplestory.world.alliance.AllianceManage;
import randall.maplestory.world.family.FamilyManage;
import randall.maplestory.world.guild.GuildManage;
import randall.maplestory.world.messenger.MessengerManage;
import randall.maplestory.world.party.PartyManage;

@Component
@RequiredArgsConstructor
public class WorldServer {

    private final CharacterChannel characterChannel;
    private final GuildManage guildManage;
    private final AllianceManage allianceManage;
    private final FamilyManage familyManage;
    private final MessengerManage messengerManage;
    private final PartyManage partyManage;

    @StopwatchMark("初始化世界服务器")
    public void init() {
        characterChannel.findChannelBy(0);
        guildManage.init();
        allianceManage.init();
        familyManage.init();
        messengerManage.getMessenger(0);
        partyManage.getParty(0);
    }

}
