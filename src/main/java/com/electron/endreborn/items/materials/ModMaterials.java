package com.electron.endreborn.items.materials;

import com.electron.endreborn.ModBlocks;
import com.electron.endreborn.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ModMaterials {
    public static IArmorMaterial ARMOR_TUNGSTEN = new IArmorMaterial() {
        @Override
        public float getToughness() {
            return 2;
        }

        @Override
        public float func_230304_f_() {
            return 0;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
        }
        @Override
        public Ingredient getRepairMaterial() {
            Ingredient repairMaterial = Ingredient.fromItems(ModItems.TUNGSTEN_INGOT.get());
            return repairMaterial;
        }
        @Override
        public String getName() {
            return "tungsten";
        }

        @Override
        public int getEnchantability() {
            return 0;
        }
        @Override
        public int getDurability(EquipmentSlotType arg0) {
            switch (arg0) {
                case HEAD:
                    return 200;
                case CHEST:
                    return 250;
                case LEGS:
                    return 250;
                case FEET:
                    return 220;
                default:
                    break;
            }
            return 0;
        }
        @Override
        public int getDamageReductionAmount(EquipmentSlotType arg0) {
            switch (arg0) {
                case HEAD:
                    return 2;
                case CHEST:
                    return 6;
                case LEGS:
                    return 5;
                case FEET:
                    return 2;
                default:
                    break;
            }
            return 0;
        }
    };

    public static IItemTier TOOL_TUNGSTEN = new IItemTier() {
        @Override
        public Ingredient getRepairMaterial() {
            Ingredient repairMaterial = Ingredient.fromItems(ModItems.TUNGSTEN_INGOT.get());
            return repairMaterial;
        }
        @Override
        public int getMaxUses() {
            return 200;
        }
        @Override
        public int getHarvestLevel() {
            return 2;
        }
        @Override
        public int getEnchantability() {
            return 0;
        }
        @Override
        public float getEfficiency() {
            return 5f;
        }
        @Override
        public float getAttackDamage() {
            return 2.5f;
        }
    };
    public static IItemTier TOOL_ENDORIUM = new IItemTier() {
        @Override
        public Ingredient getRepairMaterial() {
            Ingredient repairMaterial = Ingredient.fromItems(ModItems.ENDORIUM_INGOT.get());
            return repairMaterial;
        }
        @Override
        public int getMaxUses() {
            return 440;
        }
        @Override
        public int getHarvestLevel() {
            return 3;
        }
        @Override
        public int getEnchantability() {
            return 16;
        }
        @Override
        public float getEfficiency() {
            return 7f;
        }
        @Override
        public float getAttackDamage() {
            return 4.0f;
        }
    };
    
    public static IItemTier TOOL_ENDSTONE = new IItemTier() {
        @Override
        public Ingredient getRepairMaterial() {
            Ingredient repairMaterial = Ingredient.fromItems(ModBlocks.END_STONE_SMOOTH.get());
            return repairMaterial;
        }
        @Override
        public int getMaxUses() {
            return 200;
        }
        @Override
        public int getHarvestLevel() {
            return 1;
        }
        @Override
        public int getEnchantability() {
            return 10;
        }
        @Override
        public float getEfficiency() {
            return 3f;
        }
        @Override
        public float getAttackDamage() {
            return 1.0f;
        }
    };

    public static IArmorMaterial ENDER_BOOTS = new IArmorMaterial() {
        @Override
        public float getToughness() {
            return 2;
        }

        @Override
        public float func_230304_f_() {
            return 0;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
        }
        @Override
        public Ingredient getRepairMaterial() {
            return null;
        }
        @Override
        public String getName() {
            return "ender";
        }
        @Override
        public int getEnchantability() {
            return 10;
        }
        @Override
        public int getDurability(EquipmentSlotType arg0) {
            switch (arg0) {
                case FEET:
                    return 280;
                default:
                    break;
            }
            return 0;
        }
        @Override
        public int getDamageReductionAmount(EquipmentSlotType arg0) {
            switch (arg0) {
                case FEET:
                    return 2;
                default:
                    break;
            }
            return 0;
        }
    };
}
