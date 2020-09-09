
package net.evilpla.densemobdrops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.evilpla.densemobdrops.ElementsDensemobdropsMod;

@ElementsDensemobdropsMod.ModElement.Tag
public class TabDenseMobDrops extends ElementsDensemobdropsMod.ModElement {
	public TabDenseMobDrops(ElementsDensemobdropsMod instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdense_mob_drops") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.ENDER_PEARL, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
