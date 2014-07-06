package couk.deanreid.universalfurniture2;

import couk.deanreid.universalfurniture2.lib.Reference;
import couk.deanreid.universalfurniture2.proxy.IProxy;
import couk.deanreid.universalfurniture2.utils.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import handler.ConfigurationHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class UniversalFurniture2
    {

        //setup instance
        @Mod.Instance(Reference.MOD_ID)
        public static UniversalFurniture2 instance;

        //setup proxy
        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static IProxy proxy;


        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
            ConfigurationHandler.init(event.getSuggestedConfigurationFile());
            FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
            LogHelper.info("Pre Initialization Complete!");
        }


        @Mod.EventHandler
        public void init(FMLInitializationEvent event)
        {
            LogHelper.info("Initialization Complete!");
        }


        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {
            LogHelper.info("Post Initialization Complete!");
        }
    }

