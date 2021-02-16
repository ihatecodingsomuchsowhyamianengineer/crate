package com.novaventure.survivalessentials;

//all the imports

public class SurvivalEssentials implements ModInitializer {
    public static final String MOD_ID = "novesues";
    
    public static final Block CRATE_BLOCK = new CrateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "anchor"), ANCHOR_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "anchor"), new BlockItem(ANCHOR_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
  }
