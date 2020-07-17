
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftGearsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class PlatinumGearItemItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:platinumgearitem")
	public static final Item block = null;
	public PlatinumGearItemItem(SlothcraftModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftGearsCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("platinumgearitem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
