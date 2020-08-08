package game.actors;

import game.actors.groups.Actor;
import game.actors.groups.Group;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;
import game.tools.Sonido;

public abstract class Mob extends Sprite implements Actor
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    //Atributos de Box2D
    protected Body body;
    protected World world;
    protected Group actors;

    //Propiedades del MOB
    protected boolean isDead;
    protected boolean setToDie;
    protected float life;
    protected float speed;
    private final Sonido sonido;
    private int contadorSonidos;
    //</editor-fold>

    public Mob(World world, TextureRegion region, float life, Sonido sonido)
    {
        super(region);
        this.world = world;
        this.life = life;
        
        this.sonido = sonido;
        this.contadorSonidos = 0;
        
        isDead = setToDie = false;
    }

    public float getLife()
    {
        return life;
    }

    public Body getBody()
    {
        return body;
    }

    
    /**
     * Recibe un ataque del jugador.
     * @param player el jugador que ataca al mob.
     * @param hit cantidad de vida que se le restará al mob.
     */
    public void toRecibeAttack(Player player, float hit)
    {
        life -= hit;
        
        if(contadorSonidos == 0)
        {
            sonido.reproducir();
        }
        
        contadorSonidos++;
        if(contadorSonidos > 3)
        {
            contadorSonidos = 0;
        }
        
        //El mob que será herido
        final Mob mob = this;

        //Cantidad de segudos que permanece coloreado de rojo
        final float segundos = 1;

        //Colorear de rojo por haber sido herido
        mob.setColor(Color.CORAL);

        //Lanzar thread que espera un segundo y lo colorea a la normalidad
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(((long) (segundos)) * 1000);
                    mob.setColor(Color.WHITE);
                } catch (InterruptedException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }

        }).start();

        //Saltar por el golpe
        //body.applyLinearImpulse(0, 8f, body.getWorldCenter().x, body.getWorldCenter().y, true);

        if (life <= 0)
        {
            life = 0;
            setToDie = true;
        }
    }

    /**
     * Cambiar dirección del mob.
     */
    public abstract void changeDirection();

    /**
     * Borra al mob del mapa.
     */
    protected void delete()
    {
        for (Fixture f : body.getFixtureList())
        {
            body.destroyFixture(f);
        }
        world.destroyBody(body);
    }
}
