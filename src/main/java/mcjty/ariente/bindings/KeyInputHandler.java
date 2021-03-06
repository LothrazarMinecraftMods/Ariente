package mcjty.ariente.bindings;

import mcjty.ariente.network.ArienteMessages;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.fullHealth.isPressed()) {
            ArienteMessages.INSTANCE.sendToServer(new PacketFullHealth());
        }
    }
}
