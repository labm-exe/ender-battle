/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Manifold;
import actors.Player;

/**
 *
 * @author Karen
 */
public class WorldContactListener implements ContactListener
{
    private final Player player;

    public WorldContactListener(Player player)
    {
        this.player = player;
    }

    /**
     * Función que indica si dos fictures están en contacto
     */
    private boolean inContact(Contact contact, Object a, Object b)
    {
        return (contact.getFixtureA().getUserData().equals(a) && contact.getFixtureB().getUserData().equals(b)
                || contact.getFixtureA().getUserData().equals(b) && contact.getFixtureB().getUserData().equals(a));
    }

    @Override
    public void beginContact(Contact contact)
    {
       if (inContact(contact, "feet", "overfloor"))
       {
           player.setIsJumping(false);
       }
    }

    @Override
    public void endContact(Contact contact)
    {
        
    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold)
    {
    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse)
    {
    }

}
