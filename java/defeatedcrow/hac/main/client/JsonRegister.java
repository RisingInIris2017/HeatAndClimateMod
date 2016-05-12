package defeatedcrow.hac.main.client;

import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.ITexturePath;
import defeatedcrow.hac.core.client.JsonRegisterHelper;
import defeatedcrow.hac.main.MainInit;

public class JsonRegister {

	public static void load() {
		regItems();
		regBlocks();
		regTools();
	}

	static void regItems() {
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.oreIngot, ClimateCore.PACKAGE_ID, "dcs_ore_ingot", "ores", 7);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.oreDust, ClimateCore.PACKAGE_ID, "dcs_ore_dust", "ores", 7);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.gems, ClimateCore.PACKAGE_ID, "dcs_ore_gem", "ores", 7);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.miscDust, ClimateCore.PACKAGE_ID, "dcs_misc_dust", "ores", 5);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.stoneYagen, ClimateCore.PACKAGE_ID, "dcs_stone_yagen", "tool", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.brassYagen, ClimateCore.PACKAGE_ID, "dcs_brass_yagen", "tool", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.materials, ClimateCore.PACKAGE_ID, "dcs_material", "tool", 5);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.crowDrill, ClimateCore.PACKAGE_ID, "dcs_crow_drill", "tool", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.bakedApple, ClimateCore.PACKAGE_ID, "dcs_baked_apple", "food", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.repairPatty, ClimateCore.PACKAGE_ID, "dcs_repair_patty", "tool", 0);
	}

	static void regBlocks() {
		regCube((ITexturePath) MainInit.dustBlock, ClimateCore.PACKAGE_ID, "dcs_ore_dustblock", "ores", 15);
		regCube((ITexturePath) MainInit.metalBlock, ClimateCore.PACKAGE_ID, "dcs_ore_metalblock", "ores", 15);
		regCube((ITexturePath) MainInit.gemBlock, ClimateCore.PACKAGE_ID, "dcs_ore_gemblock", "ores", 15);
		regCube((ITexturePath) MainInit.selenite, ClimateCore.PACKAGE_ID, "dcs_build_selenite", "build", 2);

		JsonRegisterHelper.INSTANCE.regSimpleBlock(MainInit.ores, ClimateCore.PACKAGE_ID, "dcs_ore_stone", "ores", 15);
		JsonRegisterHelper.INSTANCE.regSimpleBlock(MainInit.dustBlock, ClimateCore.PACKAGE_ID, "dcs_ore_dustblock", "ores", 15);
		JsonRegisterHelper.INSTANCE.regSimpleBlock(MainInit.metalBlock, ClimateCore.PACKAGE_ID, "dcs_ore_metalblock", "ores", 15);
		JsonRegisterHelper.INSTANCE.regSimpleBlock(MainInit.gemBlock, ClimateCore.PACKAGE_ID, "dcs_ore_gemblock", "ores", 15);
		JsonRegisterHelper.INSTANCE.regSimpleBlock(MainInit.selenite, ClimateCore.PACKAGE_ID, "dcs_build_selenite", "build", 2);

		JsonRegisterHelper.INSTANCE.regTEBlock(MainInit.chamber, ClimateCore.PACKAGE_ID, "dcs_device_chamber", "machine", 0);
	}

	static void regTools() {

		String[] name = {
				"brass",
				"steel",
				"silver",
				"nickelsilver",
				"chalcedony",
				"sapphire" };
		for (int j = 0; j < name.length; j++) {
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.dcAxe[j], ClimateCore.PACKAGE_ID, "dcs_axe_" + name[j], "equip", 0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.dcPickaxe[j], ClimateCore.PACKAGE_ID, "dcs_pickaxe_" + name[j], "equip", 0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.dcSpade[j], ClimateCore.PACKAGE_ID, "dcs_spade_" + name[j], "equip", 0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.dcSword[j], ClimateCore.PACKAGE_ID, "dcs_sword_" + name[j], "equip", 0);
		}
		String[] type = {
				"met",
				"plate",
				"leggins",
				"boots" };
		for (int i = 0; i < 4; i++) {
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.brassArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_brass", "equip",
					0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.steelArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_steel", "equip",
					0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.chalcArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_chalcedony",
					"equip", 0);
			JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.sapphireArmor[i], ClimateCore.PACKAGE_ID, "dcs_" + type[i] + "_sapphire",
					"equip", 0);
		}

		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.linenUnder, ClimateCore.PACKAGE_ID, "dcs_leggins_linen", "equip", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.linenCourt, ClimateCore.PACKAGE_ID, "dcs_plate_linen", "equip", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.clothUnder, ClimateCore.PACKAGE_ID, "dcs_leggins_cloth", "equip", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.workerSuit, ClimateCore.PACKAGE_ID, "dcs_leggins_worker", "equip", 0);
		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.blackSuit, ClimateCore.PACKAGE_ID, "dcs_leggins_black", "equip", 0);

		JsonRegisterHelper.INSTANCE.regSimpleItem(MainInit.pendant, ClimateCore.PACKAGE_ID, "dcs_jewel_pendant", "equip", 9);
	}

	static void regCube(ITexturePath block, String domein, String name, String dir, int meta) {
		for (int i = 0; i <= meta; i++) {
			JsonRegisterHelper.INSTANCE.checkAndBuildJsonCube(block, domein, name, dir, i);
		}
	}

}