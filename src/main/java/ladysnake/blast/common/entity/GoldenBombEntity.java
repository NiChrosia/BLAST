package ladysnake.blast.common.entity;

import ladysnake.blast.common.init.BlastItems;
import ladysnake.blast.common.world.CustomExplosion;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class GoldenBombEntity extends BombEntity {
    public GoldenBombEntity(EntityType<? extends BombEntity> entityType, World world) {
        super(entityType, world);
    }

    public GoldenBombEntity(EntityType<? extends BombEntity> entityType, World world, LivingEntity livingEntity) {
        super(entityType, world, livingEntity);
    }

    @Override
    protected Item getDefaultItem() {
        return BlastItems.GOLDEN_BOMB;
    }

    @Override
    protected CustomExplosion getExplosion() {
        return new CustomExplosion(this.world, this.getOwner(), this.getX(), this.getY(), this.getZ(), 3f, CustomExplosion.BlockBreakEffect.FORTUNE, Explosion.DestructionType.BREAK);
    }
}
