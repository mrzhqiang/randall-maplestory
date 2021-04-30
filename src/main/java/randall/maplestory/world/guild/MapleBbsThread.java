package randall.maplestory.world.guild;

import lombok.Getter;
import randall.maplestory.domain.BbsReplie;
import randall.maplestory.domain.BbsThread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class MapleBbsThread {

    private final Map<Integer, BbsReplie> replies = new ConcurrentHashMap<>();

    private final BbsThread bbsThread;

    public MapleBbsThread(BbsThread bbsThread) {
        this.bbsThread = bbsThread;
        bbsThread.getReplies().forEach(it -> replies.put(it.getReplyid(), it));
    }

    public final int getReplyCount() {
        return replies.size();
    }

    public final boolean isNotice() {
        return bbsThread.getLocalthreadid() == 0;
    }

}
