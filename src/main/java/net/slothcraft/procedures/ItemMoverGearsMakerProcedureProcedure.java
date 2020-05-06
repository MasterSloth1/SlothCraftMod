package net.slothcraft.procedures;

import net.slothcraft.item.StoneGearItemItem;
import net.slothcraft.item.GearMoldItemItem;
import net.slothcraft.SlothCraftElements;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.item.ItemStack;

@SlothCraftElements.ModElement.Tag
public class ItemMoverGearsMakerProcedureProcedure extends SlothCraftElements.ModElement {
	public ItemMoverGearsMakerProcedureProcedure(SlothCraftElements instance) {
		super(instance, 147);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemMoverGearsMakerProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemMoverGearsMakerProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemMoverGearsMakerProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemMoverGearsMakerProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double itemDamageCount = 0;
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableTileEntity)
					return ((LockableTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(StoneGearItemItem.block, (int) (1))
				.getItem())) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableTileEntity)
					((LockableTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack _setstack = new ItemStack(StoneGearItemItem.block, (int) (1));
					_setstack.setCount((int) ((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableTileEntity) {
								ItemStack stack = ((LockableTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
					((LockableTileEntity) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableTileEntity)
					return ((LockableTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(GearMoldItemItem.block, (int) (1))
				.getItem())) {
			itemDamageCount = (double) ((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableTileEntity)
						return ((LockableTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getOrCreateTag().getDouble("Damage"));
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableTileEntity)
					((LockableTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack _setstack = new ItemStack(GearMoldItemItem.block, (int) (1));
					_setstack.setCount((int) 1);
					((LockableTileEntity) inv).setInventorySlotContents((int) (2), _setstack);
				}
			}
			(new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableTileEntity)
						return ((LockableTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getOrCreateTag().putDouble("Damage", (0 + (itemDamageCount)));
			itemDamageCount = (double) 0;
		}
	}
}
