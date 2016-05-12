package defeatedcrow.hac.main.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import defeatedcrow.hac.main.MainInit;

public class OreDicRegister {
	public static void load() {
		loadOres();
	}

	static void loadOres() {

		// ores
		OreDictionary.registerOre("oreGypsum", new ItemStack(MainInit.ores, 1, 0));
		OreDictionary.registerOre("oreIron", new ItemStack(MainInit.ores, 1, 1));
		OreDictionary.registerOre("oreChalcedonyB", new ItemStack(MainInit.ores, 1, 2));
		OreDictionary.registerOre("oreSapphire", new ItemStack(MainInit.ores, 1, 3));
		OreDictionary.registerOre("oreIron", new ItemStack(MainInit.ores, 1, 4));
		OreDictionary.registerOre("oreMagnetite", new ItemStack(MainInit.ores, 1, 5));
		OreDictionary.registerOre("oreCopper", new ItemStack(MainInit.ores, 1, 6));
		OreDictionary.registerOre("oreNickel", new ItemStack(MainInit.ores, 1, 7));
		OreDictionary.registerOre("oreZinc", new ItemStack(MainInit.ores, 1, 8));
		OreDictionary.registerOre("oreChalcedonyW", new ItemStack(MainInit.ores, 1, 9));
		OreDictionary.registerOre("oreQuartz", new ItemStack(MainInit.ores, 1, 10));
		OreDictionary.registerOre("oreGold", new ItemStack(MainInit.ores, 1, 11));
		OreDictionary.registerOre("oreSilver", new ItemStack(MainInit.ores, 1, 12));
		OreDictionary.registerOre("oreDiamond", new ItemStack(MainInit.ores, 1, 13));
		OreDictionary.registerOre("oreEmerald", new ItemStack(MainInit.ores, 1, 14));
		OreDictionary.registerOre("oreMagnetite", new ItemStack(MainInit.ores, 1, 15));

		// metals
		OreDictionary.registerOre("ingotCopper", new ItemStack(MainInit.oreIngot, 1, 0));
		OreDictionary.registerOre("ingotZinc", new ItemStack(MainInit.oreIngot, 1, 1));
		OreDictionary.registerOre("ingotNickel", new ItemStack(MainInit.oreIngot, 1, 2));
		OreDictionary.registerOre("ingotSilver", new ItemStack(MainInit.oreIngot, 1, 3));
		OreDictionary.registerOre("ingotBrass", new ItemStack(MainInit.oreIngot, 1, 4));
		OreDictionary.registerOre("ingotSteel", new ItemStack(MainInit.oreIngot, 1, 5));
		OreDictionary.registerOre("ingotNickelsilver", new ItemStack(MainInit.oreIngot, 1, 6));
		OreDictionary.registerOre("ingotMagnet", new ItemStack(MainInit.oreIngot, 1, 7));

		OreDictionary.registerOre("dustCopper", new ItemStack(MainInit.oreDust, 1, 0));
		OreDictionary.registerOre("dustZinc", new ItemStack(MainInit.oreDust, 1, 1));
		OreDictionary.registerOre("dustNickel", new ItemStack(MainInit.oreDust, 1, 2));
		OreDictionary.registerOre("dustSilver", new ItemStack(MainInit.oreDust, 1, 3));
		OreDictionary.registerOre("dustGold", new ItemStack(MainInit.oreDust, 1, 4));
		OreDictionary.registerOre("dustIron", new ItemStack(MainInit.oreDust, 1, 5));
		OreDictionary.registerOre("dustSteel", new ItemStack(MainInit.oreDust, 1, 6));
		OreDictionary.registerOre("dustMagnetite", new ItemStack(MainInit.oreDust, 1, 7));

		OreDictionary.registerOre("blockCopper", new ItemStack(MainInit.metalBlock, 1, 0));
		OreDictionary.registerOre("blockZinc", new ItemStack(MainInit.metalBlock, 1, 1));
		OreDictionary.registerOre("blockNickel", new ItemStack(MainInit.metalBlock, 1, 2));
		OreDictionary.registerOre("blockSilver", new ItemStack(MainInit.metalBlock, 1, 3));
		OreDictionary.registerOre("blockBrass", new ItemStack(MainInit.metalBlock, 1, 4));
		OreDictionary.registerOre("blockSteel", new ItemStack(MainInit.metalBlock, 1, 5));
		OreDictionary.registerOre("blockNickelsilver", new ItemStack(MainInit.metalBlock, 1, 6));
		OreDictionary.registerOre("blockMagnet", new ItemStack(MainInit.metalBlock, 1, 7));

		// gems
		OreDictionary.registerOre("gemChalcedony", new ItemStack(MainInit.gems, 1, 0));
		OreDictionary.registerOre("gemChalcedony", new ItemStack(MainInit.gems, 1, 1));
		OreDictionary.registerOre("gemChalcedony", new ItemStack(MainInit.gems, 1, 2));
		OreDictionary.registerOre("gemGypsum", new ItemStack(MainInit.gems, 1, 3));
		OreDictionary.registerOre("gemSapphire", new ItemStack(MainInit.gems, 1, 4));
		OreDictionary.registerOre("gemMalachite", new ItemStack(MainInit.gems, 1, 5));
		OreDictionary.registerOre("gemCelestite", new ItemStack(MainInit.gems, 1, 6));
		OreDictionary.registerOre("gemClam", new ItemStack(MainInit.gems, 1, 7));

		OreDictionary.registerOre("blockGemChalcedony", new ItemStack(MainInit.gemBlock, 1, 0));
		OreDictionary.registerOre("blockGemChalcedony", new ItemStack(MainInit.gemBlock, 1, 1));
		OreDictionary.registerOre("blockGemChalcedony", new ItemStack(MainInit.gemBlock, 1, 2));
		OreDictionary.registerOre("blockGemGypsum", new ItemStack(MainInit.gemBlock, 1, 3));
		OreDictionary.registerOre("blockSapphire", new ItemStack(MainInit.gemBlock, 1, 4));

		// misc
		OreDictionary.registerOre("dustCoal", new ItemStack(MainInit.miscDust, 1, 0));
		OreDictionary.registerOre("dustCrystal", new ItemStack(MainInit.miscDust, 1, 1));
		OreDictionary.registerOre("dustGypsum", new ItemStack(MainInit.miscDust, 1, 2));
		OreDictionary.registerOre("dustWood", new ItemStack(MainInit.miscDust, 1, 3));
		OreDictionary.registerOre("dustPresscake", new ItemStack(MainInit.miscDust, 1, 4));
		OreDictionary.registerOre("dustAsh", new ItemStack(MainInit.miscDust, 1, 5));

		// material
		OreDictionary.registerOre("itemString", new ItemStack(MainInit.materials, 1, 0));
		OreDictionary.registerOre("itemString", new ItemStack(MainInit.materials, 1, 1));
		OreDictionary.registerOre("itemCloth", new ItemStack(MainInit.materials, 1, 2));
		OreDictionary.registerOre("itemCloth", new ItemStack(MainInit.materials, 1, 3));
		OreDictionary.registerOre("itemLinenCloth", new ItemStack(MainInit.materials, 1, 2));
		OreDictionary.registerOre("itemCottonCloth", new ItemStack(MainInit.materials, 1, 3));
		OreDictionary.registerOre("gearWood", new ItemStack(MainInit.materials, 1, 4));
		OreDictionary.registerOre("gearArroy", new ItemStack(MainInit.materials, 1, 5));

		// tool
		OreDictionary.registerOre("toolNormalYagen", new ItemStack(MainInit.stoneYagen, 1, 32767));
		OreDictionary.registerOre("toolNormalYagen", new ItemStack(MainInit.brassYagen, 1, 32767));
	}

}