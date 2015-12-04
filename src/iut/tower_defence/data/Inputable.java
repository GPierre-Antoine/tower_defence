package iut.tower_defence.data;

import iut.tower_defence.directives.Control;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public interface Inputable {
    public void applyControl(Control order);
}
