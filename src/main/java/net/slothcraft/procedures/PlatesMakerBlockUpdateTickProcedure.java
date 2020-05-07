package net.slothcraft.procedures;

import net.slothcraft.item.PlateHammerItemItem;
import net.slothcraft.item.ChromiumPlateItemItem;
import net.slothcraft.item.AmethystPlateItemItem;
import net.slothcraft.item.AluminumPlateItemItem;
import net.slothcraft.SlothCraftElements;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.item.ItemStack;

import java.util.Random;

@SlothCraftElements.ModElement.Tag
public class PlatesMakerBlockUpdateTickProcedure extends SlothCraftElements.ModElement {
	public PlatesMakerBlockUpdateTickProcedure(SlothCraftElements instance) {
		super(instance, 141);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlatesMakerBlockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlatesMakerBlockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlatesMakerBlockUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlatesMakerBlockUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((ItemTags.getCollection().getOrCreate(new ResourceLocation(("forge:ingots/aluminum").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(PlateHammerItemItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity) {
									ItemStack stack = ((LockableTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity)
									return ((LockableTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(AluminumPlateItemItem.block, (int) (1)).getItem()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableTileEntity)
					((LockableTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack stack = ((LockableTileEntity) inv).getStackInSlot((int) (1));
					if (stack != null) {
						if (stack.attemptDamageItem((int) 1, new Random(), null)) {
							stack.shrink(1);
							stack.setDamage(0);
						}
					}
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack _setstack = new ItemStack(AluminumPlateItemItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
					((LockableTileEntity) inv).setInventorySlotContents((int) (2), _setstack);
				}
			}
		} else if (((ItemTags.getCollection().getOrCreate(new ResourceLocation(("forge:gems/amethyst").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(PlateHammerItemItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity) {
									ItemStack stack = ((LockableTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity)
									return ((LockableTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(AmethystPlateItemItem.block, (int) (1)).getItem()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableTileEntity)
					((LockableTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack stack = ((LockableTileEntity) inv).getStackInSlot((int) (1));
					if (stack != null) {
						if (stack.attemptDamageItem((int) 1, new Random(), null)) {
							stack.shrink(1);
							stack.setDamage(0);
						}
					}
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack _setstack = new ItemStack(AmethystPlateItemItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
					((LockableTileEntity) inv).setInventorySlotContents((int) (2), _setstack);
				}
			}
		} else if (((ItemTags.getCollection().getOrCreate(new ResourceLocation(("forge:ingots/chromium").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableTileEntity)
							return ((LockableTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(PlateHammerItemItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity) {
									ItemStack stack = ((LockableTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableTileEntity)
									return ((LockableTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(ChromiumPlateItemItem.block, (int) (1)).getItem()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableTileEntity)
					((LockableTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack stack = ((LockableTileEntity) inv).getStackInSlot((int) (1));
					if (stack != null) {
						if (stack.attemptDamageItem((int) 1, new Random(), null)) {
							stack.shrink(1);
							stack.setDamage(0);
						}
					}
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableTileEntity)) {
					ItemStack _setstack = new ItemStack(ChromiumPlateItemItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
					((LockableTileEntity) inv).setInventorySlotContents((int) (2), _setstack);
				}
			}
		}
	}
}
