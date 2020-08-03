/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import com.badlogic.gdx.utils.Array;

/**
 *
 * @author Karen
 */
public class Inventory {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Array <BattleObject> espadas;
    private Array <BattleObject> hachas;
    private Array <BattleObject> picos;
    private Array <BattleObject> palas;
    private Array <BattleObject> botas;
    private Array <BattleObject> pechos;
    private Array <BattleObject> pantalones;
    private Array <BattleObject> cascos;
    private Array <Arm> cosechas;
    private Array <Arm> carnes;
    //</editor-fold>
    
    public Inventory() {
        espadas = new Array<>();
        hachas = new Array<>();
        picos = new Array<>();
        palas = new Array<>();
        botas = new Array<>();
        pechos = new Array<>();
        pantalones = new Array<>();
        cascos = new Array<>();
    }

    public boolean addBattleObject(BattleObject object)
    {
        if (object.getDescription().equals(""))
        {
            return false;
        }
        
        Array <BattleObject> array;
        switch (object.getDescription()){
            case ("espada"):
                array = espadas;
                break;
            case ("hacha"):
                array = hachas;
                break;
            case ("pico"):
                array = picos;
                break;
            case ("pala"):
                array = palas;
                break;
                case ("botas"):
                array = botas;
                break;
            case ("pecho"):
                array = pechos;
                break;
            case ("casco"):
                array = pantalones;
                break;
            case ("pantalon"):
                array = cascos;
                break;
            default:
                return false;
        }
        
        if (findBattleObject(array, object.getMaterial().getMaterial()) != null)
        {
            return false;
        }
        
        array.add(object);
        return true;
    }
    
    private BattleObject findBattleObject(Array <BattleObject> array, String material)
    {
        for (BattleObject object : array) {
            if (object.material.getMaterial().equals(material))
            {
                return object;
            }
        }
        return null;
    }
    
    public boolean removeBattleObject(BattleObject object)
    {
        Array <BattleObject> array;
        switch (object.getDescription()){
            case ("espada"):
                array = espadas;
                break;
            case ("hacha"):
                array = hachas;
                break;
            case ("pico"):
                array = picos;
                break;
            case ("pala"):
                array = palas;
                break;
            case ("botas"):
                array = botas;
                break;
            case ("pecho"):
                array = pechos;
                break;
            case ("casco"):
                array = pantalones;
                break;
            case ("pantalon"):
                array = cascos;
                break;
            default:
                return false;
        }
        
        BattleObject item = findBattleObject(array, object.getMaterial().getMaterial());
        
        if (item != null)
        {
            array.removeValue(item, true);
            return true;
        }
        System.out.println("item no encontrado");
        return false;
    }
}
