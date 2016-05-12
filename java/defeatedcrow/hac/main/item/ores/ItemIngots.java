package defeatedcrow.hac.main.item.ores;

import net.minecraft.util.MathHelper;
import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.base.DCItem;

public class ItemIngots extends DCItem {

	private final int maxMeta;

	private static String[] names = {
			"copper",
			"zinc",
			"nickel",
			"silver",
			"brass",
			"steel",
			"nickelsilver",
			"magnet" };

	public ItemIngots(int max) {
		super();
		maxMeta = max;
	}

	@Override
	public int getMaxMeta() {
		return maxMeta;
	}

	/*
	 * 0: 銅
	 * 1: 亜鉛
	 * 2: ニッケル
	 * 3: 銀
	 * 4: 真鍮
	 * 5: 鋼
	 * 6: 洋白
	 * 7: 磁石
	 */
	@Override
	public String[] getNameSuffix() {
		return names;
	}

	@Override
	public String getTexPath(int meta, boolean f) {
		MathHelper.clamp_int(meta, 0, maxMeta);
		String s = "items/ores/ingot_" + names[meta];
		if (f) {
			s = "textures/" + s;
		}
		return ClimateCore.PACKAGE_ID + ":" + s;
	}

}