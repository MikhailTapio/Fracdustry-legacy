package com.teamfractal.fracdustry.common.world.generation;

import com.teamfractal.fracdustry.common.block.init.FDBlockRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case 1:
                generateEnd(world,random,chunkX,chunkZ);
                break;
            case 0:
                generateOverworld(world,random,chunkX,chunkZ);
                break;
            case -1:
                generateNether(world,random,chunkX,chunkZ);
                break;
        }
    }

    public void generateOverworld(World world, Random rand, int x, int z){
        generateOre(FDBlockRegistry.blockBauxiteOre, world, rand, x, z
                , 2, 6, 8, 3, 90, Blocks.stone);
        generateOre(FDBlockRegistry.blockCassiteriteOre, world, rand, x, z
                , 2, 8, 10, 3, 90, Blocks.stone);
        generateOre(FDBlockRegistry.blockIlmeniteOre, world, rand, x, z
                , 1, 4, 7, 3, 64, Blocks.stone);
        generateOre(FDBlockRegistry.blockSpodumeneOre, world, rand, x, z
                , 2, 10, 12, 3, 100, Blocks.stone);
    }

    public void generateEnd(World world, Random rand, int x, int z){

    }

    public void generateNether(World world, Random rand, int x, int z){

    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ,
                            int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn){
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
        for(int i = 0;i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(maxY - minY) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, xRand, yRand, zRand);
        }
    }
}
