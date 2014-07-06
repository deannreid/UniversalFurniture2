package couk.deanreid.universalfurniture2.init;

import couk.deanreid.universalfurniture2.items.itemDebug;
import couk.deanreid.universalfurniture2.items.itemUF2;
import cpw.mods.fml.common.registry.GameRegistry;

public class modItems
{
    public static final itemUF2 debug = new itemDebug();


    public static void init ()
    {
        GameRegistry.registerItem(debug, "DebugItem");
    }
}
