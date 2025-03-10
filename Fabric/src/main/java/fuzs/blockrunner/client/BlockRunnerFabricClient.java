package fuzs.blockrunner.client;

import fuzs.blockrunner.api.client.event.ComputeFovModifierCallback;
import fuzs.blockrunner.client.handler.SpeedyClientHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;

public class BlockRunnerFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerHandlers();
    }

    private static void registerHandlers() {
        SpeedyClientHandler speedyClientHandler = new SpeedyClientHandler();
        ItemTooltipCallback.EVENT.register(speedyClientHandler::onItemTooltip);
        ComputeFovModifierCallback.EVENT.register(speedyClientHandler::onComputeFovModifier);
    }
}
