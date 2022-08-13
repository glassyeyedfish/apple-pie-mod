package fish.glassyeyed.applepie;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final String MODID = "applepie";

	public static final Item APPLE_PIE = new Item(
			new FabricItemSettings().group(ItemGroup.FOOD)
      .food(new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build()));

	@Override
	public void onInitialize() {
		// Hello, Item!
		Registry.register(Registry.ITEM, new Identifier(MODID, "apple_pie"), APPLE_PIE);
	}
}
