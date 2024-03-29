/*
 *
 */
package mobile;

import java.awt.Image;
import java.util.Observer;
import java.util.Random;

import entity.AnimateGif;
import entity.Permeability;

public class Enemy extends MobileEntity {

    private static char SPRITE = 'X';
    private static String[] folderArray = { "sprites\\Mobile\\Butterfly", "sprites\\Mobile\\Blob" };
    private static Random ran = new Random();
    private static String s_ran = folderArray[ran.nextInt(folderArray.length)];

    private static Permeability PERMEABILITY = Permeability.BLOCKING;

    private AnimateGif animateGif;

    private boolean alive = true;

    public Enemy() {
        super(SPRITE, s_ran, PERMEABILITY);
        this.setPermeability(this.getPermeability());
        this.setImage(s_ran);
    }

    @Override
    public Image getImage() {
        return this.animateGif.getImage();
    }

    @Override
    public void setImage(String folder) {
        this.animateGif = new AnimateGif(folder, 200);
    }

    @Override
    public boolean isVerified() {
        return false;
    }

    @Override
    public void setVerified(boolean b) {

    }

    @Override
    public void setObserver(Observer observer) {
        this.animateGif.addObserver(observer);
    }

    @Override
    public void die() {
        this.alive = false;

    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

}