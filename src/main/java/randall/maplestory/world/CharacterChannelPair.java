package randall.maplestory.world;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@Getter
@AllArgsConstructor
public class CharacterChannelPair implements Externalizable, Comparable<CharacterChannelPair> {

    private int roleId = 0;
    private int channel = 1;

    /**
     * only for externalisation
     */
    public CharacterChannelPair() {
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        roleId = in.readInt();
        channel = in.readByte();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(roleId);
        out.writeByte(channel);
    }

    @Override
    public int compareTo(CharacterChannelPair o) {
        return this.channel - o.channel;
    }
}
