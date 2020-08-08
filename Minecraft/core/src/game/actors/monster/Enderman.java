/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.actors.monster;

import game.actors.Player;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.EdgeShape;
import com.badlogic.gdx.utils.Array;
import game.inventario.Protection;
import game.screens.GameScreen;
import game.tools.Constant;
import game.tools.Sonido;

/**
 *
 * @author Diego
 */
public class Enderman extends MonsterMob
{

    public Enderman(GameScreen screen, int x, int y, boolean isBoss)
    {
        super
        (
            screen.getWorld(), 
            screen.getAtlas().findRegion("caminar_enderman"),
            x, 
            y, 
            81,     //Ancho
            192,    //Alto
            1,      //Velocidad
            10,     //Vida
            20,     //Puntos de ataque
            isBoss, 
            new Protection(Constant.BattleObject.SWORD, Constant.Material.DIAMOND), 
            Sonido.ENDERMAN
        );

        //<editor-fold defaultstate="collapsed" desc="Definición de Sensores">
        EdgeShape sensor = new EdgeShape();
        fixtureD.shape = sensor;
        fixtureD.isSensor = true;
        fixtureD.filter.categoryBits = Constant.MOB_SENSOR_BIT;
        fixtureD.filter.maskBits = Constant.GROUND_BIT | Constant.MOB_BIT | Constant.PLAYER_BIT;

        //DERECHA
        sensor.set(getWidth() / 2, getHeight() / -2 + 0.1f, getWidth() / 2, getHeight() / 2 - 0.1f);
        body.createFixture(fixtureD).setUserData(this);

        //IZQUIERDA
        sensor.set(getWidth() / -2, getHeight() / -2 + 0.1f, getWidth() / -2, getHeight() / 2 - 0.1f);
        body.createFixture(fixtureD).setUserData(this);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Definición de animación">
        TextureRegion texture = screen.getAtlas().findRegion("caminar_enderman");
        TextureRegion[][] region = texture.split(81, 192);
        frames = new Array<>();

        for (TextureRegion[] regionF : region)
        {
            for (TextureRegion regionC : regionF)
            {
                frames.add(regionC);
            }
        }

        animation = new Animation(0.15f, frames);
        //</editor-fold>
    }

    @Override
    public void specialAttack(Player player)
    {
        body.setLinearVelocity(player.getBody().getPosition().x + 80 * player.getDirection(), 0);
    }

}
