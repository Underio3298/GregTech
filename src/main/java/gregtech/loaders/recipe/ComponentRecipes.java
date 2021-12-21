package gregtech.loaders.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.UnificationEntry;

import java.util.HashMap;
import java.util.Map;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class ComponentRecipes {

    public static void register() {

        //Field Generators Start ---------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "field_generator/field_generator_lv", FIELD_GENERATOR_LV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, ManganesePhosphide), 'P', new UnificationEntry(plate, Steel), 'G', new UnificationEntry(gemFlawless, Quartzite), 'X', new UnificationEntry(circuit, Tier.Basic));
        ModHandler.addShapedRecipe(true, "field_generator/field_generator_mv", FIELD_GENERATOR_MV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, MagnesiumDiboride), 'P', new UnificationEntry(plate, Aluminium), 'G', new UnificationEntry(gem, EnderPearl), 'X', new UnificationEntry(circuit, Tier.Good));
        ModHandler.addShapedRecipe(true, "field_generator/field_generator_hv", FIELD_GENERATOR_HV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, MercuryBariumCalciumCuprate), 'P', new UnificationEntry(plate, StainlessSteel), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.Advanced));
        ModHandler.addShapedRecipe(true, "field_generator/field_generator_ev", FIELD_GENERATOR_EV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, UraniumTriplatinum), 'P', new UnificationEntry(plateDouble, Titanium), 'G', QUANTUM_EYE.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Extreme));
        ModHandler.addShapedRecipe(true, "field_generator/field_generator_iv", FIELD_GENERATOR_IV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, SamariumIronArsenicOxide), 'P', new UnificationEntry(plateDouble, TungstenSteel), 'G', QUANTUM_STAR.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Elite));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gemFlawless, Quartzite)
                .input(plate, Steel, 2)
                .input(circuit, Tier.Basic, 2)
                .input(wireGtQuadruple, ManganesePhosphide, 4)
                .outputs(FIELD_GENERATOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gem, EnderPearl)
                .input(plate, Aluminium, 2)
                .input(circuit, Tier.Good, 2)
                .input(wireGtQuadruple, MagnesiumDiboride, 4)
                .outputs(FIELD_GENERATOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gem, EnderEye)
                .input(plate, StainlessSteel, 2)
                .input(circuit, Tier.Advanced, 2)
                .input(wireGtQuadruple, MercuryBariumCalciumCuprate, 4)
                .outputs(FIELD_GENERATOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(QUANTUM_EYE.getStackForm())
                .input(plateDouble, Titanium, 2)
                .input(circuit, Tier.Extreme, 2)
                .input(wireGtQuadruple, UraniumTriplatinum, 4)
                .outputs(FIELD_GENERATOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(QUANTUM_STAR.getStackForm())
                .input(plateDouble, TungstenSteel, 2)
                .input(circuit, Tier.Elite, 2)
                .input(wireGtQuadruple, SamariumIronArsenicOxide, 4)
                .outputs(FIELD_GENERATOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSG)
                .input(plate, HSSG, 6)
                .input(QUANTUM_STAR)
                .input(EMITTER_LUV, 2)
                .input(circuit, Tier.Master, 2)
                .input(wireFine, Ruridit, 32)
                .input(wireFine, Ruridit, 32)
                .input(wireFine, Ruridit, 32)
                .input(wireFine, Ruridit, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .output(FIELD_GENERATOR_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(plate, NaquadahAlloy, 6)
                .input(QUANTUM_STAR)
                .input(EMITTER_ZPM, 2)
                .input(circuit, Tier.Ultimate, 2)
                .input(wireFine, Europium, 32)
                .input(wireFine, Europium, 32)
                .input(wireFine, Europium, 32)
                .input(wireFine, Europium, 32)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 8))
                .output(FIELD_GENERATOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(plate, Tritanium, 6)
                .input(GRAVI_STAR)
                .input(EMITTER_UV, 2)
                .input(circuit, Tier.Super, 2)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 12))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(FIELD_GENERATOR_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Robot Arms Start ---------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "robot_arm/robot_arm_lv", ROBOT_ARM_LV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Tin), 'R', new UnificationEntry(stick, Steel), 'M', ELECTRIC_MOTOR_LV.getStackForm(), 'P', ELECTRIC_PISTON_LV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Basic));
        ModHandler.addShapedRecipe(true, "robot_arm/robot_arm_mv", ROBOT_ARM_MV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Copper), 'R', new UnificationEntry(stick, Aluminium), 'M', ELECTRIC_MOTOR_MV.getStackForm(), 'P', ELECTRIC_PISTON_MV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Good));
        ModHandler.addShapedRecipe(true, "robot_arm/robot_arm_hv", ROBOT_ARM_HV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Gold), 'R', new UnificationEntry(stick, StainlessSteel), 'M', ELECTRIC_MOTOR_HV.getStackForm(), 'P', ELECTRIC_PISTON_HV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Advanced));
        ModHandler.addShapedRecipe(true, "robot_arm/robot_arm_ev", ROBOT_ARM_EV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Aluminium), 'R', new UnificationEntry(stick, Titanium), 'M', ELECTRIC_MOTOR_EV.getStackForm(), 'P', ELECTRIC_PISTON_EV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Extreme));
        ModHandler.addShapedRecipe(true, "robot_arm/robot_arm_iv", ROBOT_ARM_IV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Tungsten), 'R', new UnificationEntry(stick, TungstenSteel), 'M', ELECTRIC_MOTOR_IV.getStackForm(), 'P', ELECTRIC_PISTON_IV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.Elite));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tin, 3)
                .input(stick, Steel, 2)
                .inputs(ELECTRIC_MOTOR_LV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_LV.getStackForm())
                .input(circuit, Tier.Basic)
                .outputs(ROBOT_ARM_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Copper, 3)
                .input(stick, Aluminium, 2)
                .inputs(ELECTRIC_MOTOR_MV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_MV.getStackForm())
                .input(circuit, Tier.Good)
                .outputs(ROBOT_ARM_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Gold, 3)
                .input(stick, StainlessSteel, 2)
                .inputs(ELECTRIC_MOTOR_HV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_HV.getStackForm())
                .input(circuit, Tier.Advanced)
                .outputs(ROBOT_ARM_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Aluminium, 3)
                .input(stick, Titanium, 2)
                .inputs(ELECTRIC_MOTOR_EV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_EV.getStackForm())
                .input(circuit, Tier.Extreme)
                .outputs(ROBOT_ARM_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tungsten, 3)
                .input(stick, TungstenSteel, 2)
                .inputs(ELECTRIC_MOTOR_IV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_IV.getStackForm())
                .input(circuit, Tier.Elite)
                .outputs(ROBOT_ARM_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, HSSS, 4)
                .input(gear, HSSS)
                .input(gearSmall, HSSG, 3)
                .input(ELECTRIC_MOTOR_LUV, 2)
                .input(ELECTRIC_PISTON_LUV)
                .input(circuit, Tier.Master)
                .input(circuit, Tier.Elite, 2)
                .input(circuit, Tier.Extreme, 4)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ROBOT_ARM_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Osmiridium, 4)
                .input(gear, Osmiridium)
                .input(gearSmall, Osmiridium, 3)
                .input(ELECTRIC_MOTOR_ZPM, 2)
                .input(ELECTRIC_PISTON_ZPM)
                .input(circuit, Tier.Ultimate)
                .input(circuit, Tier.Master, 2)
                .input(circuit, Tier.Elite, 4)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 8))
                .fluidInputs(Lubricant.getFluid(500))
                .output(ROBOT_ARM_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Tritanium, 4)
                .input(gear, Tritanium)
                .input(gearSmall, Tritanium, 3)
                .input(ELECTRIC_MOTOR_UV, 2)
                .input(ELECTRIC_PISTON_UV)
                .input(circuit, Tier.Super)
                .input(circuit, Tier.Ultimate, 2)
                .input(circuit, Tier.Master, 4)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 12))
                .fluidInputs(Lubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ROBOT_ARM_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Motors Start--------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe("electric_motor/electric_motor_lv_steel", ELECTRIC_MOTOR_LV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtSingle, Tin), 'W', new UnificationEntry(wireGtSingle, Copper), 'R', new UnificationEntry(stick, Steel), 'M', new UnificationEntry(stick, SteelMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor/electric_motor_lv_iron", ELECTRIC_MOTOR_LV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtSingle, Tin), 'W', new UnificationEntry(wireGtSingle, Copper), 'R', new UnificationEntry(stick, Iron), 'M', new UnificationEntry(stick, IronMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor/electric_motor_mv", ELECTRIC_MOTOR_MV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtSingle, Copper), 'W', new UnificationEntry(wireGtDouble, Cupronickel), 'R', new UnificationEntry(stick, Aluminium), 'M', new UnificationEntry(stick, SteelMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor/electric_motor_hv", ELECTRIC_MOTOR_HV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Silver), 'W', new UnificationEntry(wireGtDouble, Electrum), 'R', new UnificationEntry(stick, StainlessSteel), 'M', new UnificationEntry(stick, SteelMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor/electric_motor_ev", ELECTRIC_MOTOR_EV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Aluminium), 'W', new UnificationEntry(wireGtDouble, Kanthal), 'R', new UnificationEntry(stick, Titanium), 'M', new UnificationEntry(stick, NeodymiumMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor/electric_motor_iv", ELECTRIC_MOTOR_IV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Tungsten), 'W', new UnificationEntry(wireGtDouble, Graphene), 'R', new UnificationEntry(stick, TungstenSteel), 'M', new UnificationEntry(stick, NeodymiumMagnetic));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tin, 2)
                .input(stick, Iron, 2)
                .input(stick, IronMagnetic)
                .input(wireGtSingle, Copper, 4)
                .outputs(ELECTRIC_MOTOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tin, 2)
                .input(stick, Steel, 2)
                .input(stick, SteelMagnetic)
                .input(wireGtSingle, Copper, 4)
                .outputs(ELECTRIC_MOTOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Copper, 2)
                .input(stick, Aluminium, 2)
                .input(stick, SteelMagnetic)
                .input(wireGtDouble, Cupronickel, 4)
                .outputs(ELECTRIC_MOTOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Silver, 2)
                .input(stick, StainlessSteel, 2)
                .input(stick, SteelMagnetic)
                .input(wireGtDouble, Electrum, 4)
                .outputs(ELECTRIC_MOTOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Aluminium, 2)
                .input(stick, Titanium, 2)
                .input(stick, NeodymiumMagnetic)
                .input(wireGtDouble, Kanthal, 4)
                .outputs(ELECTRIC_MOTOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Tungsten, 2)
                .input(stick, TungstenSteel, 2)
                .input(stick, NeodymiumMagnetic)
                .input(wireGtDouble, Graphene, 4)
                .outputs(ELECTRIC_MOTOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, HSSS, 2)
                .input(ring, HSSS, 2)
                .input(round, HSSS, 4)
                .input(wireFine, Ruridit, 32)
                .input(wireFine, Ruridit, 32)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_MOTOR_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, Osmiridium, 4)
                .input(ring, Osmiridium, 4)
                .input(round, Osmiridium, 8)
                .input(wireFine, Duranium, 32)
                .input(wireFine, Duranium, 32)
                .input(wireFine, Duranium, 32)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .fluidInputs(Lubricant.getFluid(500))
                .output(ELECTRIC_MOTOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, Tritanium, 4)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 8)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(wireFine, Americium, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_MOTOR_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Sensors Start-------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "sensor/sensor_lv", SENSOR_LV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Steel), 'R', new UnificationEntry(stick, Brass), 'G', new UnificationEntry(gem, Quartzite), 'X', new UnificationEntry(circuit, Tier.Basic));
        ModHandler.addShapedRecipe(true, "sensor/sensor_mv", SENSOR_MV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Aluminium), 'R', new UnificationEntry(stick, Electrum), 'G', new UnificationEntry(gem, NetherQuartz), 'X', new UnificationEntry(circuit, Tier.Good));
        ModHandler.addShapedRecipe(true, "sensor/sensor_hv", SENSOR_HV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, StainlessSteel), 'R', new UnificationEntry(stick, Chrome), 'G', new UnificationEntry(gem, Emerald), 'X', new UnificationEntry(circuit, Tier.Advanced));
        ModHandler.addShapedRecipe(true, "sensor/sensor_ev", SENSOR_EV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Titanium), 'R', new UnificationEntry(stick, Platinum), 'G', new UnificationEntry(gem, EnderPearl), 'X', new UnificationEntry(circuit, Tier.Extreme));
        ModHandler.addShapedRecipe(true, "sensor/sensor_iv", SENSOR_IV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, TungstenSteel), 'R', new UnificationEntry(stick, Iridium), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.Elite));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass)
                .input(plate, Steel, 4)
                .input(circuit, Tier.Basic)
                .input(gem, Quartzite)
                .outputs(SENSOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Electrum)
                .input(plate, Aluminium, 4)
                .input(circuit, Tier.Good)
                .input(gem, NetherQuartz)
                .outputs(SENSOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Chrome)
                .input(plate, StainlessSteel, 4)
                .input(circuit, Tier.Advanced)
                .input(gem, Emerald)
                .outputs(SENSOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Platinum)
                .input(plate, Titanium, 4)
                .input(circuit, Tier.Extreme)
                .input(gem, EnderPearl)
                .outputs(SENSOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Iridium)
                .input(plate, TungstenSteel, 4)
                .input(circuit, Tier.Elite)
                .input(gem, EnderEye)
                .outputs(SENSOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LUV)
                .input(stickLong, Ruridit, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.Master, 2)
                .input(foil, Palladium, 32)
                .input(foil, Palladium, 32)
                .input(foil, Palladium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .output(SENSOR_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(ELECTRIC_MOTOR_ZPM)
                .input(stickLong, Osmiridium, 4)
                .input(QUANTUM_STAR, 2)
                .input(circuit, Tier.Ultimate, 2)
                .input(foil, Trinium, 32)
                .input(foil, Trinium, 32)
                .input(foil, Trinium, 32)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .output(SENSOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(ELECTRIC_MOTOR_UV)
                .input(stickLong, Tritanium, 4)
                .input(GRAVI_STAR)
                .input(circuit, Tier.Super, 2)
                .input(foil, Naquadria, 32)
                .input(foil, Naquadria, 32)
                .input(foil, Naquadria, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 8))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(SENSOR_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Emitters Start------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "emitter/emitter_lv", EMITTER_LV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Brass), 'C', new UnificationEntry(cableGtSingle, Tin), 'G', new UnificationEntry(gem, Quartzite), 'X', new UnificationEntry(circuit, Tier.Basic));
        ModHandler.addShapedRecipe(true, "emitter/emitter_mv", EMITTER_MV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Electrum), 'C', new UnificationEntry(cableGtSingle, Copper), 'G', new UnificationEntry(gem, NetherQuartz), 'X', new UnificationEntry(circuit, Tier.Good));
        ModHandler.addShapedRecipe(true, "emitter/emitter_hv", EMITTER_HV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Chrome), 'C', new UnificationEntry(cableGtSingle, Gold), 'G', new UnificationEntry(gem, Emerald), 'X', new UnificationEntry(circuit, Tier.Advanced));
        ModHandler.addShapedRecipe(true, "emitter/emitter_ev", EMITTER_EV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Platinum), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'G', new UnificationEntry(gem, EnderPearl), 'X', new UnificationEntry(circuit, Tier.Extreme));
        ModHandler.addShapedRecipe(true, "emitter/emitter_iv", EMITTER_IV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Iridium), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.Elite));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass, 4)
                .input(cableGtSingle, Tin, 2)
                .input(circuit, Tier.Basic, 2)
                .input(gem, Quartzite)
                .circuitMeta(1)
                .outputs(EMITTER_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Electrum, 4)
                .input(cableGtSingle, Copper, 2)
                .input(circuit, Tier.Good, 2)
                .input(gem, NetherQuartz)
                .circuitMeta(1)
                .outputs(EMITTER_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Chrome, 4)
                .input(cableGtSingle, Gold, 2)
                .input(circuit, Tier.Advanced, 2)
                .input(gem, Emerald)
                .circuitMeta(1)
                .outputs(EMITTER_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Platinum, 4)
                .input(cableGtSingle, Aluminium, 2)
                .input(circuit, Tier.Extreme, 2)
                .input(gem, EnderPearl)
                .circuitMeta(1)
                .outputs(EMITTER_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Iridium, 4)
                .input(cableGtSingle, Tungsten, 2)
                .input(circuit, Tier.Elite, 2)
                .input(gem, EnderEye)
                .circuitMeta(1)
                .outputs(EMITTER_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LUV)
                .input(plate, Ruridit, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.Master, 2)
                .input(foil, Palladium, 32)
                .input(foil, Palladium, 32)
                .input(foil, Palladium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .output(EMITTER_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(ELECTRIC_MOTOR_ZPM)
                .input(plate, Osmiridium, 4)
                .input(QUANTUM_STAR, 2)
                .input(circuit, Tier.Ultimate, 2)
                .input(foil, Trinium, 32)
                .input(foil, Trinium, 32)
                .input(foil, Trinium, 32)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .output(EMITTER_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(plate, Tritanium, 4)
                .input(GRAVI_STAR)
                .input(circuit, Tier.Super, 2)
                .input(foil, Naquadria, 32)
                .input(foil, Naquadria, 32)
                .input(foil, Naquadria, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 8))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(EMITTER_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Pistons Start-------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "electric_piston/electric_piston_lv", ELECTRIC_PISTON_LV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Steel), 'C', new UnificationEntry(cableGtSingle, Tin), 'R', new UnificationEntry(stick, Steel), 'G', new UnificationEntry(gearSmall, Steel), 'M', ELECTRIC_MOTOR_LV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston/electric_piston_mv", ELECTRIC_PISTON_MV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Aluminium), 'C', new UnificationEntry(cableGtSingle, Copper), 'R', new UnificationEntry(stick, Aluminium), 'G', new UnificationEntry(gearSmall, Aluminium), 'M', ELECTRIC_MOTOR_MV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston/electric_piston_hv", ELECTRIC_PISTON_HV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, StainlessSteel), 'C', new UnificationEntry(cableGtSingle, Gold), 'R', new UnificationEntry(stick, StainlessSteel), 'G', new UnificationEntry(gearSmall, StainlessSteel), 'M', ELECTRIC_MOTOR_HV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston/electric_piston_ev", ELECTRIC_PISTON_EV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Titanium), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'R', new UnificationEntry(stick, Titanium), 'G', new UnificationEntry(gearSmall, Titanium), 'M', ELECTRIC_MOTOR_EV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston/electric_piston_iv", ELECTRIC_PISTON_IV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, TungstenSteel), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'R', new UnificationEntry(stick, TungstenSteel), 'G', new UnificationEntry(gearSmall, TungstenSteel), 'M', ELECTRIC_MOTOR_IV.getStackForm());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Steel, 2)
                .input(cableGtSingle, Tin, 2)
                .input(plate, Steel, 3)
                .input(gearSmall, Steel)
                .inputs(ELECTRIC_MOTOR_LV.getStackForm())
                .outputs(ELECTRIC_PISTON_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Aluminium, 2)
                .input(cableGtSingle, Copper, 2)
                .input(plate, Aluminium, 3)
                .input(gearSmall, Aluminium)
                .inputs(ELECTRIC_MOTOR_MV.getStackForm())
                .outputs(ELECTRIC_PISTON_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, StainlessSteel, 2)
                .input(cableGtSingle, Gold, 2)
                .input(plate, StainlessSteel, 3)
                .input(gearSmall, StainlessSteel)
                .inputs(ELECTRIC_MOTOR_HV.getStackForm())
                .outputs(ELECTRIC_PISTON_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Titanium, 2)
                .input(cableGtSingle, Aluminium, 2)
                .input(plate, Titanium, 3)
                .input(gearSmall, Titanium)
                .inputs(ELECTRIC_MOTOR_EV.getStackForm())
                .outputs(ELECTRIC_PISTON_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, TungstenSteel, 2)
                .input(cableGtSingle, Tungsten, 2)
                .input(plate, TungstenSteel, 3)
                .input(gearSmall, TungstenSteel)
                .inputs(ELECTRIC_MOTOR_IV.getStackForm())
                .outputs(ELECTRIC_PISTON_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();


        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LUV)
                .input(plate, HSSS, 4)
                .input(ring, HSSS, 4)
                .input(round, HSSS, 16)
                .input(stick, HSSS, 4)
                .input(gear, HSSS)
                .input(gearSmall, HSSS, 2)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_PISTON_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM)
                .input(plate, Osmiridium, 4)
                .input(ring, Osmiridium, 4)
                .input(round, Osmiridium, 16)
                .input(stick, Osmiridium, 4)
                .input(gear, Osmiridium)
                .input(gearSmall, Osmiridium, 2)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .fluidInputs(Lubricant.getFluid(500))
                .output(ELECTRIC_PISTON_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(plate, Tritanium, 4)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 16)
                .input(stick, Tritanium, 4)
                .input(gear, NaquadahAlloy)
                .input(gearSmall, NaquadahAlloy, 2)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_PISTON_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Conveyors Start-----------------------------------------------------------------------------------------------
        final Map<String, Material> rubberMaterials = new HashMap<String, Material>() {{
            put("rubber", Rubber);
            put("silicone_rubber", SiliconeRubber);
            put("styrene_butadiene_rubber", StyreneButadieneRubber);
        }};

        for (Map.Entry<String, Material> materialEntry : rubberMaterials.entrySet()) {
            ModHandler.addShapedRecipe(String.format("conveyor_module/%s/conveyor_module_lv", materialEntry.getKey()), CONVEYOR_MODULE_LV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Tin), 'M', ELECTRIC_MOTOR_LV.getStackForm());
            ModHandler.addShapedRecipe(String.format("conveyor_module/%s/conveyor_module_mv", materialEntry.getKey()), CONVEYOR_MODULE_MV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Copper), 'M', ELECTRIC_MOTOR_MV.getStackForm());
            ModHandler.addShapedRecipe(String.format("conveyor_module/%s/conveyor_module_hv", materialEntry.getKey()), CONVEYOR_MODULE_HV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Gold), 'M', ELECTRIC_MOTOR_HV.getStackForm());
            ModHandler.addShapedRecipe(String.format("conveyor_module/%s/conveyor_module_ev", materialEntry.getKey()), CONVEYOR_MODULE_EV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'M', ELECTRIC_MOTOR_EV.getStackForm());
            if (!materialEntry.getValue().equals(Rubber))
                ModHandler.addShapedRecipe(String.format("conveyor_module/%s/conveyor_module_iv", materialEntry.getKey()), CONVEYOR_MODULE_IV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'M', ELECTRIC_MOTOR_IV.getStackForm());

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Tin)
                    .input(plate, materialEntry.getValue(), 6)
                    .inputs(ELECTRIC_MOTOR_LV.getStackForm(2))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_LV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Copper)
                    .input(plate, materialEntry.getValue(), 6)
                    .inputs(ELECTRIC_MOTOR_MV.getStackForm(2))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_MV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Gold)
                    .input(plate, materialEntry.getValue(), 6)
                    .inputs(ELECTRIC_MOTOR_HV.getStackForm(2))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_HV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Aluminium)
                    .input(plate, materialEntry.getValue(), 6)
                    .inputs(ELECTRIC_MOTOR_EV.getStackForm(2))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_EV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            if (!materialEntry.getValue().equals(Rubber))
                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(cableGtSingle, Tungsten)
                        .input(plate, materialEntry.getValue(), 6)
                        .inputs(ELECTRIC_MOTOR_IV.getStackForm(2))
                        .circuitMeta(1)
                        .outputs(CONVEYOR_MODULE_IV.getStackForm())
                        .duration(100).EUt(VA[LV]).buildAndRegister();


            //Pumps Start---------------------------------------------------------------------------------------------------
            ModHandler.addShapedRecipe(String.format("electric_pump/%s/electric_pump_lv", materialEntry.getKey()), ELECTRIC_PUMP_LV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, Tin), 'X', new UnificationEntry(rotor, Tin), 'P', new UnificationEntry(pipeNormalFluid, Bronze), 'R', new UnificationEntry(ring, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Tin), 'M', ELECTRIC_MOTOR_LV.getStackForm());
            ModHandler.addShapedRecipe(String.format("electric_pump/%s/electric_pump_mv", materialEntry.getKey()), ELECTRIC_PUMP_MV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, Bronze), 'X', new UnificationEntry(rotor, Bronze), 'P', new UnificationEntry(pipeNormalFluid, Steel), 'R', new UnificationEntry(ring, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Copper), 'M', ELECTRIC_MOTOR_MV.getStackForm());
            ModHandler.addShapedRecipe(String.format("electric_pump/%s/electric_pump_hv", materialEntry.getKey()), ELECTRIC_PUMP_HV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, Steel), 'X', new UnificationEntry(rotor, Steel), 'P', new UnificationEntry(pipeNormalFluid, StainlessSteel), 'R', new UnificationEntry(ring, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Gold), 'M', ELECTRIC_MOTOR_HV.getStackForm());
            ModHandler.addShapedRecipe(String.format("electric_pump/%s/electric_pump_ev", materialEntry.getKey()), ELECTRIC_PUMP_EV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, StainlessSteel), 'X', new UnificationEntry(rotor, StainlessSteel), 'P', new UnificationEntry(pipeNormalFluid, Titanium), 'R', new UnificationEntry(ring, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'M', ELECTRIC_MOTOR_EV.getStackForm());
            if (!materialEntry.getValue().equals(Rubber))
                ModHandler.addShapedRecipe(String.format("electric_pump/%s/electric_pump_iv", materialEntry.getKey()), ELECTRIC_PUMP_IV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, TungstenSteel), 'X', new UnificationEntry(rotor, TungstenSteel), 'P', new UnificationEntry(pipeNormalFluid, TungstenSteel), 'R', new UnificationEntry(ring, materialEntry.getValue()), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'M', ELECTRIC_MOTOR_IV.getStackForm());

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Tin)
                    .input(pipeNormalFluid, Bronze)
                    .input(screw, Tin)
                    .input(rotor, Tin)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_LV.getStackForm())
                    .outputs(ELECTRIC_PUMP_LV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Copper)
                    .input(pipeNormalFluid, Steel)
                    .input(screw, Bronze)
                    .input(rotor, Bronze)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_MV.getStackForm())
                    .outputs(ELECTRIC_PUMP_MV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Copper)
                    .input(pipeNormalFluid, StainlessSteel)
                    .input(screw, Steel)
                    .input(rotor, Steel)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_HV.getStackForm())
                    .outputs(ELECTRIC_PUMP_HV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Aluminium)
                    .input(pipeNormalFluid, Titanium)
                    .input(screw, StainlessSteel)
                    .input(rotor, StainlessSteel)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_EV.getStackForm())
                    .outputs(ELECTRIC_PUMP_EV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            if (!materialEntry.getValue().equals(Rubber))
                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(cableGtSingle, Tungsten)
                        .input(pipeNormalFluid, TungstenSteel)
                        .input(screw, TungstenSteel)
                        .input(rotor, TungstenSteel)
                        .input(ring, materialEntry.getValue(), 2)
                        .inputs(ELECTRIC_MOTOR_IV.getStackForm())
                        .outputs(ELECTRIC_PUMP_IV.getStackForm())
                        .duration(100).EUt(VA[LV]).buildAndRegister();
        }

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LUV, 2)
                .input(plate, HSSS, 2)
                .input(ring, HSSS, 4)
                .input(screw, HSSS, 4)
                .input(round, HSSS, 16)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 8))
                .output(CONVEYOR_MODULE_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM, 2)
                .input(plate, Osmiridium, 2)
                .input(ring, Osmiridium, 4)
                .input(screw, Osmiridium, 4)
                .input(round, Osmiridium, 16)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .fluidInputs(Lubricant.getFluid(500))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 16))
                .output(CONVEYOR_MODULE_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV, 2)
                .input(plate, Tritanium, 2)
                .input(ring, Tritanium, 4)
                .input(screw, Tritanium, 4)
                .input(round, Tritanium, 16)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(1000))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 24))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(CONVEYOR_MODULE_UV)
                .duration(600).EUt(100000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LUV)
                .input(pipeSmallFluid, NiobiumTitanium)
                .input(plate, HSSS, 2)
                .input(screw, HSSS, 8)
                .input(ring, SiliconeRubber, 4)
                .input(rotor, HSSS)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_PUMP_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM)
                .input(pipeNormalFluid, Polybenzimidazole)
                .input(plate, Osmiridium, 2)
                .input(screw, Osmiridium, 8)
                .input(ring, SiliconeRubber, 8)
                .input(rotor, Osmiridium)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .fluidInputs(Lubricant.getFluid(500))
                .output(ELECTRIC_PUMP_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(pipeLargeFluid, Naquadah)
                .input(plate, Tritanium, 2)
                .input(screw, Tritanium, 8)
                .input(ring, SiliconeRubber, 16)
                .input(rotor, NaquadahAlloy)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_PUMP_UV)
                .duration(600).EUt(100000).buildAndRegister();

        //Fluid Regulators----------------------------------------------------------------------------------------------
        Material[] circuitTiers = new Material[]{Tier.Basic, Tier.Good, Tier.Advanced, Tier.Extreme,
                Tier.Elite, Tier.Master, Tier.Ultimate, Tier.Super};

        for (int i = 0; i < FLUID_REGULATORS.length; i++) {
            ASSEMBLER_RECIPES.recipeBuilder().circuitMeta(1)
                    .inputs(PUMPS[i].getStackForm())
                    .input(circuit, circuitTiers[i], 2)
                    .outputs(FLUID_REGULATORS[i].getStackForm())
                    .EUt(VA[i + 1])
                    .duration(400 - 50 * i)
                    .buildAndRegister();
        }
    }
}
