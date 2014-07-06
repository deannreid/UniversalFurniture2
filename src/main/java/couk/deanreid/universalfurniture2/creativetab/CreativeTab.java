package couk.deanreid.universalfurniture2.creativetab;

import couk.deanreid.universalfurniture2.init.modItems;
import couk.deanreid.universalfurniture2.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTab
{
    public static final CreativeTabs UF2_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
           return modItems.debug;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return StatCollector.translateToLocal("key.categories.universalfurniture2");
        }
    };
}
