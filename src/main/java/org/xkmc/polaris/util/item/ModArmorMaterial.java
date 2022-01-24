package org.xkmc.polaris.util.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import org.xkmc.polaris.Polaris;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    STARDUST("stardust", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    STARBURST("starburst", 5, new int[]{5, 9, 8, 4}, 15,
    SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    STAR_LORD("star_lord", 5, new int[]{6, 9, 9, 6}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    MSBase("ms_base", 5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    MSWhiteTiger("ms_white_tiger", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    MSBlueDragon("ms_blue_dragon", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    MSVermilionBird("ms_vermilion_bird", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    MSBlackTortoise("ms_black_tortoise", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    SupremeGenesis("supreme_genesis", 5, new int[]{4, 10, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    }),
    LittleCat("little_cat", 5, new int[]{7, 10, 10, 7}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.EndAlloyIngot.get());
    });
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> ingredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(ingredientSupplier);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotType) {
        return this.slotProtections[slotType.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotType) {
        return this.slotProtections[slotType.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Polaris.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
