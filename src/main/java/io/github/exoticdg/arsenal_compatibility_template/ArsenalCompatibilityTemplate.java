package io.github.exoticdg.arsenal_compatibility_template;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArsenalCompatibilityTemplate implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Arsenal Compatibility Template");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}