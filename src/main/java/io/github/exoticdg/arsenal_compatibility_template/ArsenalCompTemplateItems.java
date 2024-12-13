package io.github.exoticdg.arsenal_compatibility_template;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ArsenalCompTemplateItems {
	public static final Item TestTrident = new Item(new QuiltItemSettings());

	public static final Item TestShield = new Item(new QuiltItemSettings());

	public static final Item TestRangedWeapon = new Item(new QuiltItemSettings());

	public static final Item TestWeapon = new Item(new QuiltItemSettings());

	public static final Item TestTrident32x32 = new Item(new QuiltItemSettings());

	public static final Item TestShield32x32 = new Item(new QuiltItemSettings());

	public static final Item TestRangedWeapon32x32 = new Item(new QuiltItemSettings());

	public static final Item TestWeapon32x32 = new Item(new QuiltItemSettings());

	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_trident"), TestTrident);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_shield"), TestShield);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_ranged_weapon"), TestRangedWeapon);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_weapon"), TestWeapon);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_trident_32x32"), TestTrident32x32);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_shield_32x32"), TestShield32x32);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_ranged_weapon_32x32"), TestRangedWeapon32x32);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "arsenal_compatibility_template_test_weapon_32x32"), TestWeapon32x32);
	}
}
