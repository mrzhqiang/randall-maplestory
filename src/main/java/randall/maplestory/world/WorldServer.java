package randall.maplestory.world;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;
import randall.maplestory.world.family.FamilyManage;
import randall.maplestory.world.guild.AllianceManage;
import randall.maplestory.world.guild.GuildManage;

@Slf4j
@Component
@RequiredArgsConstructor
public class WorldServer {

    private final CharacterChannel characterChannel;
    private final GuildManage guildManage;
    private final AllianceManage allianceManage;
    private final FamilyManage familyManage;

    @StopwatchMark("初始化世界服务器")
    public void init() {
        characterChannel.findChannelBy(0);
        guildManage.init();
        allianceManage.init();
        familyManage.init();
    }

}
