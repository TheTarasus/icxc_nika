package ru.thetarasus.icxcnika.iiiiiii;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII.IIIII;
import ru.thetarasus.icxcnika.II_II;

@Mixin(ClientPlayNetworkHandler.class)
public class IIIIIIIIIIIIIII {
	@Inject(at = @At("TAIL"), method = "onGameJoin")
	private void iiii(GameJoinS2CPacket packet, CallbackInfo ci) {
		II_II.createC2SPacket(IIIII.iIIiiiiIiII, IIIII.iiiiiIiIIiIII.length(), IIIII.iiiiiIiIIiIII);
	}
}
