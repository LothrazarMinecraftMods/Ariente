package mcjty.ariente.items;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {

    public static GenericItem platinumIngot;
    public static GenericItem lithiumIngot;
    public static GenericItem manganeseIngot;
    public static GenericItem silverIngot;

    public static GenericItem negariteDust;
    public static GenericItem posiriteDust;

    public static EnergySabreItem energySabre;
    public static EnhancedEnergySabreItem enhancedEnergySabreItem;
    public static KeyCardItem keyCardItem;
    public static DirtyDiamondItem dirtyDiamondItem;

    public static void init() {
        platinumIngot = new GenericItem("ingot_platinum");
        lithiumIngot = new GenericItem("ingot_lithium");
        manganeseIngot = new GenericItem("ingot_manganese");
        silverIngot = new GenericItem("ingot_silver");

        negariteDust = new GenericItem("dust_negarite");
        posiriteDust = new GenericItem("dust_posirite");

        energySabre = new EnergySabreItem("energy_sabre");
        enhancedEnergySabreItem = new EnhancedEnergySabreItem("enhanced_energy_sabre");
        keyCardItem = new KeyCardItem();

        dirtyDiamondItem = new DirtyDiamondItem();
    }

    public static void initOreDict() {
        OreDictionary.registerOre("ingotSilver", silverIngot);
        OreDictionary.registerOre("ingotPlatinum", platinumIngot);
        OreDictionary.registerOre("ingotManganese", manganeseIngot);
        OreDictionary.registerOre("ingotLithium", lithiumIngot);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        platinumIngot.initModel();
        lithiumIngot.initModel();
        manganeseIngot.initModel();
        silverIngot.initModel();
        negariteDust.initModel();
        posiriteDust.initModel();

        energySabre.initModel();
        enhancedEnergySabreItem.initModel();
        keyCardItem.initModel();

        dirtyDiamondItem.initModel();
    }

}
