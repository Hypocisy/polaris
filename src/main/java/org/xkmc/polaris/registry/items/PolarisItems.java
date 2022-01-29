package org.xkmc.polaris.registry.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import org.xkmc.polaris.item.armor.PolarisArmorItem;
import org.xkmc.polaris.registry.Registration;
import org.xkmc.polaris.util.PolarisItemGroup;
import org.xkmc.polaris.interfaces.PolarisArmorMaterial;

public class PolarisItems {
        // I 星币
        public static final RegistryObject<Item> StarCoin1 = Registration.ITEMS.register("star_coin_1",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // II 星币
        public static final RegistryObject<Item> StarCoin2 = Registration.ITEMS.register("star_coin_2",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // III 星币
        public static final RegistryObject<Item> StarCoin3 = Registration.ITEMS.register("star_coin_3",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // IV星币
        public static final RegistryObject<Item> StarCoin4 = Registration.ITEMS.register("star_coin_4",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // V星币
        public static final RegistryObject<Item> StarCoin5 = Registration.ITEMS.register("star_coin_5",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // VI星币
        public static final RegistryObject<Item> StarCoin6 = Registration.ITEMS.register("star_coin_6",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // VII星币
        public static final RegistryObject<Item> StarCoin7 = Registration.ITEMS.register("star_coin_7",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // VIII星币
        public static final RegistryObject<Item> StarCoin8 = Registration.ITEMS.register("star_coin_8",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 矿石之心
        public static final RegistryObject<Item> HeartOfOre = Registration.ITEMS.register("heart_of_ore",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 炼狱之壤
        public static final RegistryObject<Item> PurgatorySoil = Registration.ITEMS.register("purgatory_soil",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 魔物之核
        public static final RegistryObject<Item> DemonSoul = Registration.ITEMS.register("demon_soul",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 万物之壤
        public static final RegistryObject<Item> TheSoilOfEverything = Registration.ITEMS.register(
                        "the_soil_of_everything",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 璀璨下界之星
        public static final RegistryObject<Item> NetherStar = Registration.ITEMS.register("nether_star",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 璀璨下界之星精华
        public static final RegistryObject<Item> NetherStarEssence = Registration.ITEMS.register("nether_star_essence",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 终界合金锭
        public static final RegistryObject<Item> EndAlloyIngot = Registration.ITEMS.register("end_alloy_ingot",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 终界精华
        public static final RegistryObject<Item> EndEssence = Registration.ITEMS.register(
                        "end_essence",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 精炼下届合金锭
        public static final RegistryObject<Item> NetherAlloyIngotEssence = Registration.ITEMS.register(
                        "nether_alloy_ingot_essence",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 激活符文核心1
        public static final RegistryObject<Item> ActivatingCore1 = Registration.ITEMS.register("activating_core_1",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 激活符文核心2
        public static final RegistryObject<Item> ActivatingCore2 = Registration.ITEMS.register("activating_core_2",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 激活符文核心3
        public static final RegistryObject<Item> ActivatingCore3 = Registration.ITEMS.register("activating_core_3",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 激活符文核心4
        public static final RegistryObject<Item> ActivatingCore4 = Registration.ITEMS.register("activating_core_4",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 激活神权核心
        public static final RegistryObject<Item> ActivatingCorePower = Registration.ITEMS.register(
                        "activating_core_power",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 未激活符文核心1
        public static final RegistryObject<Item> InactiveCore1 = Registration.ITEMS.register("inactive_core_1",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 未激活符文核心2
        public static final RegistryObject<Item> InactiveCore2 = Registration.ITEMS.register("inactive_core_2",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 未激活符文核心3
        public static final RegistryObject<Item> InactiveCore3 = Registration.ITEMS.register("inactive_core_3",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 未激活符文核心4
        public static final RegistryObject<Item> InactiveCore4 = Registration.ITEMS.register("inactive_core_4",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 未激活神权核心
        public static final RegistryObject<Item> InactiveCorePower = Registration.ITEMS.register("inactive_core_power",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 虚空之源
        public static final RegistryObject<Item> TheVoidOfSource = Registration.ITEMS.register("the_void_of_source",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 灵魂之炎
        public static final RegistryObject<Item> FlameOfTheSoul = Registration.ITEMS.register("flame_of_the_soul",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 神性之灵
        public static final RegistryObject<Item> SpiritOfDivinity = Registration.ITEMS.register("spirit_of_divinity",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 生命之种
        public static final RegistryObject<Item> LifeOfSeeds = Registration.ITEMS.register("life_of_seeds",
                        () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 恶魂之泣
        public static final RegistryObject<Item> CryingGhost = Registration.ITEMS.register("crying_ghost",
                () -> new Item(new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_MISCELLANEOUS)));
        // 装备

        // 星界之尘头盔
        public static final RegistryObject<ArmorItem> StardustHelmet = Registration.ITEMS.register("stardust_helmet",
                () -> new PolarisArmorItem(PolarisArmorMaterial.STARDUST, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之尘胸甲
        public static final RegistryObject<ArmorItem> StardustChest = Registration.ITEMS.register("stardust_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.STARDUST, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之尘护腿
        public static final RegistryObject<ArmorItem> StardustLeggings = Registration.ITEMS.register("stardust_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.STARDUST, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之尘靴子
        public static final RegistryObject<ArmorItem> StardustBoots = Registration.ITEMS.register("stardust_boots",
                () -> new ArmorItem(PolarisArmorMaterial.STARDUST, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 星界之辉套
        // 星界之辉头盔
        public static final RegistryObject<ArmorItem> StarburstHelmet = Registration.ITEMS.register("starburst_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.STARBURST, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之辉胸甲
        public static final RegistryObject<ArmorItem> StarburstChest = Registration.ITEMS.register("starburst_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.STARBURST, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之辉护腿
        public static final RegistryObject<ArmorItem> StarburstLeggings = Registration.ITEMS.register("starburst_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.STARBURST, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之辉靴子
        public static final RegistryObject<ArmorItem> StarburstBoots = Registration.ITEMS.register("starburst_boots",
                () -> new ArmorItem(PolarisArmorMaterial.STARBURST, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 星界之主
        // 星界之主头盔
        public static final RegistryObject<ArmorItem> StarLordHelmet = Registration.ITEMS.register("star_lord_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.STAR_LORD, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之主胸甲
        public static final RegistryObject<ArmorItem> StarLordChest = Registration.ITEMS.register("star_lord_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.STAR_LORD, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之主护腿
        public static final RegistryObject<ArmorItem> StarLordLeggings = Registration.ITEMS.register("star_lord_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.STAR_LORD, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 星界之主靴子
        public static final RegistryObject<ArmorItem> StarLordBoots = Registration.ITEMS.register("star_lord_boots",
                () -> new ArmorItem(PolarisArmorMaterial.STAR_LORD, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 玄灵系列
        // 玄灵头盔
        public static final RegistryObject<ArmorItem> MSBaseHelmet = Registration.ITEMS.register("ms_base_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.MSBase, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵胸甲
        public static final RegistryObject<ArmorItem> MSBaseChest = Registration.ITEMS.register("ms_base_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.MSBase, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵护腿
        public static final RegistryObject<ArmorItem> MSBaseLeggings = Registration.ITEMS.register("ms_base_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.MSBase, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵靴子
        public static final RegistryObject<ArmorItem> MSBaseBoots = Registration.ITEMS.register("ms_base_boots",
                () -> new ArmorItem(PolarisArmorMaterial.MSBase, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 玄灵白虎
        // 玄灵白虎头盔
        public static final RegistryObject<ArmorItem> MSWhiteTigerHelmet = Registration.ITEMS.register("ms_white_tiger_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.MSWhiteTiger, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵白虎胸甲
        public static final RegistryObject<ArmorItem> MSWhiteTigerChest = Registration.ITEMS.register("ms_white_tiger_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.MSWhiteTiger, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵白虎灵护腿
        public static final RegistryObject<ArmorItem> MSWhiteTigerLeggings = Registration.ITEMS.register("ms_white_tiger_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.MSWhiteTiger, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵白虎靴子
        public static final RegistryObject<ArmorItem> MSWhiteTigerBoots = Registration.ITEMS.register("ms_white_tiger_boots",
                () -> new ArmorItem(PolarisArmorMaterial.MSWhiteTiger, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 玄灵青龙
        // 玄灵青龙头盔
        public static final RegistryObject<ArmorItem> MSBlueDragonHelmet = Registration.ITEMS.register("ms_blue_dragon_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlueDragon, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵青龙胸甲
        public static final RegistryObject<ArmorItem> MSBlueDragonChest = Registration.ITEMS.register("ms_blue_dragon_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlueDragon, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵青龙护腿
        public static final RegistryObject<ArmorItem> MSBlueDragonLeggings = Registration.ITEMS.register("ms_blue_dragon_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlueDragon, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵青龙靴子
        public static final RegistryObject<ArmorItem> MSBlueDragonBoots = Registration.ITEMS.register("ms_blue_dragon_boots",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlueDragon, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 玄灵朱雀
        // 玄灵朱雀头盔
        public static final RegistryObject<ArmorItem> MSVermilionBirdHelmet = Registration.ITEMS.register("ms_vermilion_bird_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.MSVermilionBird, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵朱雀胸甲
        public static final RegistryObject<ArmorItem> MSVermilionBirdChest = Registration.ITEMS.register("ms_vermilion_bird_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.MSVermilionBird, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵朱雀护腿
        public static final RegistryObject<ArmorItem> MSVermilionBirdLeggings = Registration.ITEMS.register("ms_vermilion_bird_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.MSVermilionBird, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵朱雀靴子
        public static final RegistryObject<ArmorItem> MSVermilionBirdBoots = Registration.ITEMS.register("ms_vermilion_bird_boots",
                () -> new ArmorItem(PolarisArmorMaterial.MSVermilionBird, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 玄灵玄武
        // 玄灵玄武头盔
        public static final RegistryObject<ArmorItem> MSBlackTortoiseHelmet = Registration.ITEMS.register("ms_black_tortoise_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlackTortoise, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵玄武胸甲
        public static final RegistryObject<ArmorItem> MSBlackTortoiseChest = Registration.ITEMS.register("ms_black_tortoise_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlackTortoise, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵玄武护腿
        public static final RegistryObject<ArmorItem> MSBlackTortoiseLeggings = Registration.ITEMS.register("ms_black_tortoise_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlackTortoise, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 玄灵玄武靴子
        public static final RegistryObject<ArmorItem> MSBlackTortoiseBoots = Registration.ITEMS.register("ms_black_tortoise_boots",
                () -> new ArmorItem(PolarisArmorMaterial.MSBlackTortoise, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 至高创世
        // 至高创世头盔
        public static final RegistryObject<ArmorItem> SupremeGenesisHelmet = Registration.ITEMS.register("supreme_genesis_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesis, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 至高创世胸甲
        public static final RegistryObject<ArmorItem> SupremeGenesisChest = Registration.ITEMS.register("supreme_genesis_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesis, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 至高创世护腿
        public static final RegistryObject<ArmorItem> SupremeGenesisLeggings = Registration.ITEMS.register("supreme_genesis_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesis, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 至高创世靴子
        public static final RegistryObject<ArmorItem> SupremeGenesisBoots = Registration.ITEMS.register("supreme_genesis_boots",
                () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesis, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 帝王新衣
        // 帝王新衣头盔
        public static final RegistryObject<ArmorItem> EmperorsNewClothesHelmet = Registration.ITEMS.register("emperors_new_clothes_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 帝王新衣胸甲
        public static final RegistryObject<ArmorItem> EmperorsNewClothesChest = Registration.ITEMS.register("emperors_new_clothes_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 帝王新衣护腿
        public static final RegistryObject<ArmorItem> EmperorsNewClothesLeggings = Registration.ITEMS.register("emperors_new_clothes_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 帝王新衣靴子
        public static final RegistryObject<ArmorItem> EmperorsNewClothesBoots = Registration.ITEMS.register("emperors_new_clothes_boots",
                () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 猫猫Color1
        // 猫猫头盔
        public static final RegistryObject<ArmorItem> LittleCatHelmet = Registration.ITEMS.register("little_cat_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫胸甲
        public static final RegistryObject<ArmorItem> LittleCatChest = Registration.ITEMS.register("little_cat_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫护腿
        public static final RegistryObject<ArmorItem> LittleCatLeggings = Registration.ITEMS.register("little_cat_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫靴子
        public static final RegistryObject<ArmorItem> LittleCatBoots = Registration.ITEMS.register("little_cat_boots",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 猫猫Color2
        // 猫猫头盔
        public static final RegistryObject<ArmorItem> LittleCat2Helmet = Registration.ITEMS.register("little_cat2_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫胸甲
        public static final RegistryObject<ArmorItem> LittleCat2Chest = Registration.ITEMS.register("little_cat2_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫护腿
        public static final RegistryObject<ArmorItem> LittleCat2Leggings = Registration.ITEMS.register("little_cat2_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫靴子
        public static final RegistryObject<ArmorItem> LittleCat2Boots = Registration.ITEMS.register("little_cat2_boots",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        // 猫猫Color3
        // 猫猫头盔
        public static final RegistryObject<ArmorItem> LittleCat3Helmet = Registration.ITEMS.register("little_cat3_helmet",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.HEAD, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫胸甲
        public static final RegistryObject<ArmorItem> LittleCat3Chest = Registration.ITEMS.register("little_cat3_chestplate",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.CHEST, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫护腿
        public static final RegistryObject<ArmorItem> LittleCat3Leggings = Registration.ITEMS.register("little_cat3_leggings",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.LEGS, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));
        // 猫猫靴子
        public static final RegistryObject<ArmorItem> LittleCat3Boots = Registration.ITEMS.register("little_cat3_boots",
                () -> new ArmorItem(PolarisArmorMaterial.LittleCat, EquipmentSlotType.FEET, new Item.Properties().tab(PolarisItemGroup.TAB_POLARIS_ARMORS)));

        public static void register() {
        };
}
