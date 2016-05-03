package mods.railcraft.common.modules;

import mods.railcraft.common.blocks.RailcraftBlocks;
import mods.railcraft.common.blocks.detector.BlockDetector;
import mods.railcraft.common.carts.EnumCart;
import mods.railcraft.common.items.ItemIngot;
import mods.railcraft.common.items.RailcraftItem;
import mods.railcraft.common.plugins.forge.CraftingPlugin;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by CovertJaguar on 5/3/2016 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class ModuleRF extends RailcraftModule {
    @Override
    public void initFirst() {
        BlockDetector.registerBlock();
        RailcraftBlocks.registerBlockMachineGamma();

        EnumCart cart = EnumCart.REDSTONE_FLUX;
        if (cart.setup()) {
            CraftingPlugin.addShapedRecipe(cart.getCartItem(),
                    "LRL",
                    "RMR",
                    "LRL",
                    'R', new ItemStack(Blocks.redstone_block),
                    'L', RailcraftItem.ingot, ItemIngot.EnumIngot.LEAD,
                    'M', Items.minecart
            );
        }
    }
}
