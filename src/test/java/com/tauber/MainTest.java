package com.tauber;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

/**
 * Created by radar on 6/22/15.
 */
public class MainTest {

    private static final IMocksControl control = EasyMock.createStrictControl();
    private static final Game game = control.createMock(Game.class);

    @Test
    public void testMainMethod() {

        Main.setGame(game);
        game.run();
        EasyMock.expectLastCall().once();

        EasyMock.replay(game);

        Main.main(new String[]{});

        EasyMock.verify(game);
    }
}
