/*
 *
 */
package controller;

import contract.IModel;
import contract.IView;
import mobile.MobileEntityFactory;

/**
 * The Class ControllerRock.
 */
public class ControllerRock extends Controller {

    /**
     * Instantiates a new controller rock.
     *
     * @param view the view
     * @param model the model
     */
    public ControllerRock(IView view, IModel model) {
        super(view, model);
        // TODO Auto-generated constructor stub
    }

    /**
     * Move.
     *
     * @param x the x
     * @param y the y
     */
    public void move(int x, int y) {

        if (this.getModel().getMap().getOnTheMapXY(x, y).getClass() == MobileEntityFactory.createRock().getClass()) {
            if ((this.checkMove(this.getModel().getMap().getOnTheMapXY(x, y),
                    this.getModel().getMap().getOnTheMapXY(x, y).getX(),
                    this.getModel().getMap().getOnTheMapXY(x, y).getY() + 1))) {
                this.getModel().getMap().getOnTheMapXY(x, y).setVerified(true);
                this.moveDown(this.getModel().getMap().getOnTheMapXY(x, y));
                this.getModel().getMap().getOnTheMapXY(x, y + 1).setCanKill(true);
                this.kill(x, y + 1);

            }

            else if (this.checkMove(this.getModel().getMap().getOnTheMapXY(x, y),
                    this.getModel().getMap().getOnTheMapXY(x, y).getX() + 1,
                    this.getModel().getMap().getOnTheMapXY(x, y).getY() + 1)) {
                if (this.getModel().getMap().getOnTheMapXY(x, y + 1).getClass() == MobileEntityFactory.createRock()
                        .getClass()) {
                    this.getModel().getMap().getOnTheMapXY(x, y).setVerified(true);
                    this.moveRightDown(this.getModel().getMap().getOnTheMapXY(x, y));
                    this.getModel().getMap().getOnTheMapXY(x, y + 1).setCanKill(true);
                    this.kill(x, y + 1);
                }
            }

            else if (this.checkMove(this.getModel().getMap().getOnTheMapXY(x, y),
                    this.getModel().getMap().getOnTheMapXY(x, y).getX() - 1,
                    this.getModel().getMap().getOnTheMapXY(x, y).getY() + 1)) {
                if (this.getModel().getMap().getOnTheMapXY(x, y + 1).getClass() == MobileEntityFactory.createRock()
                        .getClass()) {
                    this.getModel().getMap().getOnTheMapXY(x, y).setVerified(true);
                    this.moveLeftDown(this.getModel().getMap().getOnTheMapXY(x, y));
                    this.getModel().getMap().getOnTheMapXY(x, y + 1).setCanKill(true);
                    this.kill(x, y + 1);
                }
            }
        }
    }

}