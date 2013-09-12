package noobhause.MoarDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="noobhaus_moardimensions", name="More Dimensions", version="0.0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MoarDimensions
{
/** Dimension ID **/
/** NOOB HAUS Says we Do that Dim later, but maybe not?? **/
public static int mdDimID=1010;
public static int PortalKeyID;
public static int PortalControlerID;

/** Blocks **/
public static Block BlockPortalControler;

/** Items **/
public static Item PortalKey;

/** Biome's **/

@Mod.PreInit
public void preint(FMLPreInitializationEvent event)
{
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

	config.load();

	PortalControlerID = config.getBlock("PortalControler", 752).getInt();
	PortalKeyID = config.getItem("PortalKey", 1010).getInt();
		
	config.save();	
}


@Mod.Init
public void load(FMLInitializationEvent event)
{
/** Register Blocks **/
	BlockPortalControler = (BlockPortalControler)new BlockPortalControler(PortalControlerID, Material.ground).setUnlocalizedName("MoarDimensions:MoarDimensionsProtalControler");
	LanguageRegistry.addName(BlockPortalControler, "Portal Controler");
/** Register Items **/
	PortalKey = new ItemPortalKey(PortalKeyID).setUnlocalizedName("MoarDimensions:MoarDimensionsPortalKey");
	LanguageRegistry.addName(PortalKey, "Portal Key");
/** Add In-Game Names **/

/**Register WorldProvider for Dimension **/

}

@Mod.PostInit
public static void postInit(FMLPostInitializationEvent event)
{
	
}
}