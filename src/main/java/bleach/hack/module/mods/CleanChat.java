package bleach.hack.module.mods;

import bleach.hack.command.Command;
import bleach.hack.event.events.EventReadPacket;
import bleach.hack.module.Category;
import bleach.hack.module.Module;
import bleach.hack.utils.file.BleachFileMang;
import com.google.common.eventbus.Subscribe;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CleanChat extends Module {

    public CleanChat() {
        super("CleanChat", KEY_UNBOUND, Category.CHAT, "checks messages you receive and removes ones with bad words in them! To add words \"" + Command.PREFIX + "cleanchat add/del [word]\"");
    }


}
