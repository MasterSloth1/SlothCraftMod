
package net.slothcraft.itemgroup;

import net.slothcraft.item.AluminumGearItemItem;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothCraftElements.ModElement.Tag
public class SlothCraftPlatesCreativeTabItemGroup extends SlothCraftElements.ModElement {
	public SlothCraftPlatesCreativeTabItemGroup(SlothCraftElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabslothcraftplatescreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AluminumGearItemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
