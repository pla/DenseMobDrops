
package net.evilpla.densemobdrops.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.evilpla.densemobdrops.creativetab.TabDenseMobDrops;
import net.evilpla.densemobdrops.ElementsDensemobdropsMod;

import java.util.List;

@ElementsDensemobdropsMod.ModElement.Tag
public class BlockGunpowder9 extends ElementsDensemobdropsMod.ModElement {
	@GameRegistry.ObjectHolder("densemobdrops:gunpowder_9")
	public static final Block block = null;
	public BlockGunpowder9(ElementsDensemobdropsMod instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("gunpowder_9"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("densemobdrops:gunpowder_9", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.SAND);
			setUnlocalizedName("gunpowder_9");
			setSoundType(SoundType.SAND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabDenseMobDrops.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("387m Gunpowder");
		}
	}
}
