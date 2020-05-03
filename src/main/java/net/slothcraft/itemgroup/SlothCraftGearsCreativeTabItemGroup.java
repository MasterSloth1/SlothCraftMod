
package net.slothcraft.itemgroup;

import net.slothcraft.item.AmethystGearItemItem;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothCraftElements.ModElement.Tag
public class SlothCraftGearsCreativeTabItemGroup extends SlothCraftElements.ModElement {
	public SlothCraftGearsCreativeTabItemGroup(SlothCraftElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabslothcraftgearscreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmethystGearItemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
