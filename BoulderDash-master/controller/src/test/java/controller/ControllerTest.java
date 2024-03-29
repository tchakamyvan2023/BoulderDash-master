/*
 *
 */
package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.IEntity;
import mobile.MobileEntityFactory;

/**
 * The Class ControllerTest.
 */
public class ControllerTest {
    
    /** The controller. */
    private Controller controller;

    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        this.controller = new Controller(null, null);
    }

    /**
     * Tear down.
     *
     * @throws Exception the exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test controller.
     */
    @Test
    public void testController() {
        assertNotNull(this.controller);
    }

    /**
     * Test set view.
     */
    @Test
    public void testSetView() {
        this.controller.setView(null);
        assertNull(this.controller.getView());
    }

    /**
     * Test get view.
     */
    @Test
    public void testGetView() {
        assertNull(this.controller.getView());
    }

    /**
     * Test get model.
     */
    @Test
    public void testGetModel() {
        assertNull(this.controller.getModel());
    }

    /**
     * Test check move.
     */
    @Test
    public void testCheckMove() {
        assertEquals(false, this.controller.checkMove(MobileEntityFactory.createCharacter(), 1, 0));
    }

    /**
     * Test move down.
     */
    @Test
    public void testMoveDown() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveDown(test);
        assertNotNull(MobileEntityFactory.createCharacter().getY());
    }

    /**
     * Test move left.
     */
    @Test
    public void testMoveLeft() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveLeft(test);
        assertNotNull(MobileEntityFactory.createCharacter().getX());
    }

    /**
     * Test move right.
     */
    @Test
    public void testMoveRight() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveRight(test);
        assertNotNull(MobileEntityFactory.createCharacter().getX());
    }

    /**
     * Test move up.
     */
    @Test
    public void testMoveUp() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveUp(test);
        assertNotNull(MobileEntityFactory.createCharacter().getY());
    }

    /**
     * Test move left down.
     */
    @Test
    public void testMoveLeftDown() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveLeftDown(test);
        assertNotNull(MobileEntityFactory.createCharacter().getY());
        assertNotNull(MobileEntityFactory.createCharacter().getX());
    }

    /**
     * Test move right down.
     */
    @Test
    public void testMoveRightDown() {
        IEntity test = MobileEntityFactory.createCharacter();
        this.controller.moveRightDown(test);
        assertNotNull(MobileEntityFactory.createCharacter().getY());
        assertNotNull(MobileEntityFactory.createCharacter().getX());
    }

    /**
     * Test get diamond count.
     */
    @Test
    public void testGetDiamondCount() {
        assertEquals(0, this.controller.getDiamondCount());
    }

    /**
     * Test get diamond limit.
     */
    @Test
    public void testGetDiamondLimit() {
        assertEquals(0, this.controller.getDiamondLimit());
    }

    /**
     * Test set diamond limit.
     */
    @Test
    public void testSetDiamondLimit() {
        this.controller.setDiamondLimit(5);
        assertEquals(5, this.controller.getDiamondLimit());
    }

}
