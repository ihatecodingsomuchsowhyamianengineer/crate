package com.novaventure.survivalessentials;

//all the imports

public class SurvivalEssentials implements ModInitializer {
    public static final String MOD_ID = "novesues";
    
    public static final Block CRATE_BLOCK = new CrateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD));

    @Override
    public void onInitialize() {
        //crate
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "crate"), BlockEntityType.Builder.create(CrateBlockEntity::new, CRATE_BLOCK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crate"), CRATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crate"), new BlockItem(CRATE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));

    }
  }
