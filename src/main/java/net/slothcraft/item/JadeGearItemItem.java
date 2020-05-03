
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftGearsCreativeTabItemGroup;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothCraftElements.ModElement.Tag
public class JadeGearItemItem extends SlothCraftElements.ModElement {
	@ObjectHolder("slothcraft:jadegearitem")
	public static final Item block = null;
	public JadeGearItemItem(SlothCraftElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftGearsCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("jadegearitem");
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
