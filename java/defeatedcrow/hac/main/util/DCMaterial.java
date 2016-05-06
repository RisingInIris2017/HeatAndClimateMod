package defeatedcrow.hac.main.util;

import net.minecraft.item.ItemStack;
import defeatedcrow.hac.main.MainInit;

public enum DCMaterial {
	/* (name, atk, def, tire, dur, eff, enchant, heat, cold, repair) */

	// 耐火耐寒性能の高さ以外特になし
	LINEN(0, "linen", 1.0F, new int[] {
			1,
			2,
			2,
			1 }, 0, 72, 0.0F, 20, 2.0F, 2.0F, new ItemStack(MainInit.materials, 1, 0)),
	CLOTH(1, "cloth", 1.0F, new int[] {
			1,
			2,
			2,
			1 }, 0, 108, 0.0F, 25, 3.0F, 3.0F, new ItemStack(MainInit.materials, 1, 1)),
	// 純金属は基本的に利用しない
	COPPER(2, "copper", 2.0F, new int[] {
			1,
			2,
			2,
			1 }, 1, 128, 1.0F, 5, 0.5F, 0.5F, new ItemStack(MainInit.oreIngot, 1, 0)),
	ZINC(3, "zinc", 2.0F, new int[] {
			1,
			2,
			2,
			1 }, 1, 128, 1.0F, 5, 0.5F, 0.5F, new ItemStack(MainInit.oreIngot, 1, 1)),
	NICKEL(4, "nickel", 2.0F, new int[] {
			1,
			2,
			2,
			1 }, 1, 256, 1.0F, 5, 0.5F, 0.5F, new ItemStack(MainInit.oreIngot, 1, 2)),
	// 主にアクセサリー用。実用に耐えうる金という感じ
	SILVER(5, "silver", 2.0F, new int[] {
			2,
			5,
			4,
			2 }, 1, 256, 4.0F, 22, 1.0F, 1.0F, new ItemStack(MainInit.oreIngot, 1, 3)),
	// 普段使い用の金属。鉄の上位互換。
	BRASS(6, "brass", 2.0F, new int[] {
			3,
			6,
			5,
			2 }, 2, 384, 6.0F, 10, 0.5F, 0.5F, new ItemStack(MainInit.oreIngot, 1, 4)),
	// 耐久値が高いが鉄より弱い
	NICKELSILVER(7, "nickelsilver", 2.0F, new int[] {
			2,
			4,
			4,
			2 }, 2, 1080, 4.0F, 18, 1.0F, 1.0F, new ItemStack(MainInit.oreIngot, 1, 6)),
	// 熱に弱いが他が強い
	STEEL(8, "steel", 3.0F, new int[] {
			5,
			9,
			6,
			4 }, 3, 640, 7.0F, 8, 0.5F, 0.5F, new ItemStack(MainInit.oreIngot, 1, 5)),
	// ピーキー性能
	CHALCEDONY(9, "chalcedony", 4.0F, new int[] {
			4,
			8,
			6,
			4 }, 3, 72, 10.0F, 25, 1.5F, 1.5F, new ItemStack(MainInit.gems, 1, 0)),
	// 黒曜石が掘れないだけのダイヤ
	SAPPHIRE(10, "sapphire", 3.0F, new int[] {
			3,
			8,
			6,
			3 }, 2, 1280, 7.0F, 18, 1.0F, 1.0F, new ItemStack(MainInit.gems, 1, 4));

	public final String name;
	public final int id;
	public final float attackDam;
	public final int[] reduceDam;
	public final int harvestTier;
	public final int duration;
	public final int armorDur;
	public final float efficiency;
	public final int enchant;
	public final float prevHeat;
	public final float prevCold;
	public final ItemStack repairItem;

	private DCMaterial(int i, String n, float atk, int[] def, int tier, int dur, float eff, int enc, float heat, float cold,
			ItemStack repair) {
		id = i;
		name = n;
		attackDam = atk;
		reduceDam = def;
		harvestTier = tier;
		duration = dur;
		armorDur = dur / 20;
		efficiency = eff;
		enchant = enc;
		prevHeat = heat;
		prevCold = cold;
		repairItem = repair;
	}
}
